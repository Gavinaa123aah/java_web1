package com.jikexuyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest2 {

	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void insertUserData(Connection conn) throws SQLException {
		
			String sql = "insert into tbl_user(id,name,password,email)"
					+ "values(10,'tom','yy','1430@bjtu')";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向用户表插入了"+count+"条记录");

	}
	
	public static void insertAddressData(Connection conn) throws SQLException{

			String sql = "insert into tbl_address(id,city,country,userid)"
					+ "values(1,'shanghai','china','10')";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向地址表插入了"+count+"条记录");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			
			insertUserData(conn);
			insertAddressData(conn);
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("=====捕获到异常====");
			e.printStackTrace();
			
			try {
				conn.rollback();
				System.out.println("=====事务回滚成功=====");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

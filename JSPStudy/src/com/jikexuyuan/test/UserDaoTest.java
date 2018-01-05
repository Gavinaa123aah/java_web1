package com.jikexuyuan.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.jikexuyuan.dao.UserDao;
import com.jikexuyuan.dao.impl.UserDaoImpl;
import com.jikexuyuan.entity.User;
import com.jikexuyuan.util.ConnectionFacory;

public class UserDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = ConnectionFacory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			UserDao userDao = new UserDaoImpl();
			User user = new User();
			user.setId((long) 4);
			user.setName("tom");
			user.setPassword("tom");
			user.setEmail("@bjtu");
			
			userDao.save(conn, user);
			
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}

}

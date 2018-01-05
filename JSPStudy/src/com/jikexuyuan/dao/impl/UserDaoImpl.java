/**
 * 
 */
package com.jikexuyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jikexuyuan.dao.UserDao;
import com.jikexuyuan.entity.User;

/**
 * @author a
 *
 */
public class UserDaoImpl implements UserDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jikexuyuan.dao.UserDao#save(java.sql.Connection,
	 * com.jikexuyuan.entity.User)
	 */
	@Override
	public void save(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = connection
				.prepareCall("insert into tbl_user(name,password,email,id) values (?,?,?,?)");
		pStatement.setString(1, user.getName());
		pStatement.setString(2, user.getPassword());
		pStatement.setString(3, user.getEmail());
		pStatement.setLong(4, user.getId());
		pStatement.execute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jikexuyuan.dao.UserDao#update(java.sql.Connection,
	 * java.lang.Long, com.jikexuyuan.entity.User)
	 */
	@Override
	public void update(Connection connection, Long id, User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update tbl_user set name = ?, password = ?, email = ? where id = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);

		pStatement.setString(1, user.getName());
		pStatement.setString(2, user.getPassword());
		pStatement.setString(3, user.getEmail());
		pStatement.setLong(4, user.getId());

		pStatement.execute();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jikexuyuan.dao.UserDao#delete(java.sql.Connection,
	 * com.jikexuyuan.entity.User)
	 */
	@Override
	public void delete(Connection connection, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = connection.prepareStatement("delete from tbl_user where id=?");
		preparedStatement.setLong(1, user.getId());
		preparedStatement.execute();
	}

}

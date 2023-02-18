package javaOracleWebix.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleWebix.entity.User;
import javaOracleWebix.mapper.UserMapper;
import javaOracleWebix.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserMapper mapper;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return mapper.getAllUsers();
	}
	
	@Override
	public User getUserById(@Param("id") int id) throws SQLException {
		// TODO Auto-generated method stub
		return mapper.getUserById(id);
		
		
	}
	
	@Override
	public List<User> getUserByUse(@Param("use")String use) throws SQLException {
		// TODO Auto-generated method stub
		return mapper.getUserByUse(use);
}
	
	@Override
	public User getUserByName(@Param("name")String name) throws SQLException {
		// TODO Auto-generated method stub
		return mapper.getUserByName(name);
	}
	
	@Override
	public User getUserByUId(@Param("userId") int userid) throws SQLException {
		// TODO Auto-generated method stub
		return mapper.getUserByUId(userid);
	}
	
}

package javaOracleWebix.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUsers();
	
	User getUserById(int id) throws SQLException;
	List<User> getUserByUse(String use) throws SQLException;
	User getUserByName(String name) throws SQLException;
	User getUserByUId(int userid) throws SQLException;
}

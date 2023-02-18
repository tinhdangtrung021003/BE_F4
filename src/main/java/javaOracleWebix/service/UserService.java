package javaOracleWebix.service;

import java.sql.SQLException;
import java.util.List;


import javaOracleWebix.entity.User;

public interface UserService {
List<User> getAllUsers();

User getUserById( int id) throws SQLException;

List<User> getUserByUse( String use) throws SQLException;

User getUserByName(String name) throws SQLException;

User getUserByUId(int userid) throws SQLException;
}

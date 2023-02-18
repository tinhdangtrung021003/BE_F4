package javaOracleWebix.service;

import java.sql.SQLException;
import java.util.List;

import javaOracleWebix.entity.Role;

public interface RoleService {
	List<Role> getAllRoles();
	

	void saveRole(Role paramRole) throws SQLException;
     
	void saveRoleDetail(Role roleDetail) throws SQLException;
	//Role getRoleIdMax();
}

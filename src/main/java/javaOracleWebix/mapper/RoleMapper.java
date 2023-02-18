package javaOracleWebix.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.Role;
@Mapper
public interface RoleMapper {
	List<Role> getAllRoles();
	
	void saveRole(Role paramRole) throws SQLException;
	
	void saveRoleDetail(Role roleDetail);
	int getNewRoleId();
	void updateRole(Role roleDetail);
}

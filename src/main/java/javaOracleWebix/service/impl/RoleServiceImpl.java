package javaOracleWebix.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleWebix.entity.Role;
import javaOracleWebix.mapper.RoleMapper;
import javaOracleWebix.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	
	@Autowired
	private RoleMapper mapper;

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return mapper.getAllRoles();
	}
	
	@Override
	public void saveRole(Role paramRole) throws SQLException {
		// TODO Auto-generated method stub
		mapper.saveRole(paramRole);
	}
	////////////////
	@Override
	public void saveRoleDetail(Role roleDetail){
		if(roleDetail.getRoLeId() == 0) {
			roleDetail.setRoLeId(mapper.getNewRoleId());
			mapper.saveRoleDetail(roleDetail);  
			System.out.println(">> "+roleDetail.getRoLeId());
		}else {
			mapper.updateRole(roleDetail);  
			System.out.println(">> update");
		}
	/////////////
	}
 
//	@Override
//	public Role getRoleIdMax() {
//		// TODO Auto-generated method stub
//		return mapper.getRoleIdMax();
//	}
	
}

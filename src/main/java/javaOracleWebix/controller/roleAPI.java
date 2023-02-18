package javaOracleWebix.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebix.entity.Role;
import javaOracleWebix.service.RoleService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/role")
@CrossOrigin( origins = {"http://localhost:8081"})
public class roleAPI {

	@Autowired
	private RoleService Service;
	
	@GetMapping("/getAllRoles")
	ResponseEntity<?> getAllRoles() {
		return ResponseEntity.ok(Service.getAllRoles());
	}
	
	@PostMapping("/saveRole")
	ResponseEntity<?> doPostSaveRole(@RequestBody Role paramRole){
		HashMap<String, Object> result = new HashMap<>();
		try {
			Service.saveRole(paramRole);
			result.put("success",true );
			result.put("message", "success When Call API saveRole");
			result.put("data", paramRole);
		} catch (Exception e) {
			log.error("loi", e);

			result.put("success",false );
			result.put("message", "Fail When Call API saveRole");
			result.put("data", null);
		}
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/saveRoleDetail")
	ResponseEntity<?> doPostSaveRoleDetail(@RequestBody Role roleDetail){
		HashMap<String, Object> result = new HashMap<>();
		System.out.println(roleDetail.getRoLeId());
		System.out.println(roleDetail.getRoLeName());
		System.out.println(roleDetail.getIsUse());
		System.out.println(roleDetail.getImage());
		System.out.println(roleDetail.getDesCription());
		
		try {
			Service.saveRoleDetail(roleDetail);
			result.put("success",true );
			result.put("message", "success When Call API saveRoleDetail");
			result.put("data", roleDetail);
		} catch (Exception e) {
			log.error("loi", e);

			result.put("success",false );
			result.put("message", "Fail When Call API saveRoleDetail");
			result.put("data", null);
		}
		return ResponseEntity.ok(result);
	}
	
//	@GetMapping("/getAllRoleId")
//	ResponseEntity<?> getAllRoleId() {
//		return ResponseEntity.ok();
//	}
//	
}

package javaOracleWebix.controller;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebix.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserAPI {

	@Autowired
	private UserService Service;

	@GetMapping("/getAllUsers")
	ResponseEntity<?> getAllKhachHang() {
		return ResponseEntity.ok(Service.getAllUsers());
	}
	@GetMapping("/getUserById")
	ResponseEntity<?> getUserById(@RequestParam("id") int id) throws SQLException{
		return ResponseEntity.ok(Service.getUserById(id));
	}
	
	@GetMapping("/getUserByUse")
	ResponseEntity<?> getUserByUse(@RequestParam("use") String use) throws SQLException{
		return ResponseEntity.ok(Service.getUserByUse(use));
	}
	
	@GetMapping("/getUserByName")
	ResponseEntity<?> getUserByName(@RequestParam("name") String name) throws SQLException{
		return ResponseEntity.ok(Service.getUserByName(name));
	}
	
	@GetMapping("/getUserByUId")
	ResponseEntity<?> getUserByUId(@RequestParam("userId") int userid) throws SQLException{
		return ResponseEntity.ok(Service.getUserByUId(userid));
	}
//////update main
}

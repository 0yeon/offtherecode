package com.last.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.last.code.dto.UserDTO;
import com.last.code.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("otc")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/members")
	public List<UserDTO> selectMemberList() {
		log.info(service.selectAll().toString());
		return service.selectAll();
	}
	
	@PostMapping("/login")
	public int login(@RequestBody String user_email, String user_pw) {
		return service.login(user_email, user_pw);
	}
	
	@PostMapping("/memberAdd")
	public UserDTO userAdd(@RequestBody UserDTO dto) {
		service.userAdd(dto);
		return dto;
	}
	
	@PostMapping("/memberPwChange")
	public int userPwChange(@RequestBody String pw) {
		
		return service.userPwChange(pw);
	}

	@PostMapping("/memberNickChange")
	public int userNickChange(@RequestBody String nick) {
		return service.userNickChange(nick);
	}
	
//	@GetMapping("/memberDelete")
//	public String userEmailDelete(@RequestBody String email) {
//		return ser
//	}
	
//	@GetMapping("/memberDetail")
//	public UserDTO userDetail(@RequestParam("user_pno") int pno) {
//		log.info(service.userDetail(pno).toString());
//		return service.userDetail(pno);
//	}
}

package com.last.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.last.code.dto.UserDTO;
import com.last.code.repository.UserMapperRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserMapperRepository mapper;
	
	public List<UserDTO> selectAll() {		
		return mapper.selectAll();
	}
	
	public int userAdd(UserDTO dto) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		dto.setUser_pw(encoder.encode(dto.getUser_pw()));
		return mapper.userAdd(dto);
	}
	
	public int userPwChange(String pw) {
		return mapper.userPwModify(pw);
	}
	
	public int userNickChange(String nick) {
		return mapper.userNickModify(nick);
	}
	
	public int login(String user_email, String user_pw) {
		return mapper.login(user_email, user_pw);
	}

	
//	public UserDTO userDetail(int pno) {
//		return mapper.selectOne(pno);
//	}
}

package com.last.code.persistence;

import java.util.List;

import org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.last.code.dto.UserDTO;
import com.last.code.repository.UserMapperRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest

public class UserMapperTest {

	@Autowired
	private UserMapperRepository userMapper;
	
	
	
	
}

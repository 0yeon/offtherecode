package com.last.code.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDTO {
	
	private int user_pno;
	private String user_email;
	private String user_pw;
	private String user_nick;

}
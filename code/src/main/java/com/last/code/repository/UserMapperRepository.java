package com.last.code.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.last.code.dto.UserDTO;

@Mapper
public interface UserMapperRepository{

	@Select("select * from tbl_user")
	public List<UserDTO> selectAll();
	
	@Select("select user_email, user_pw from tbl_user")
	public int login(String user_email, String user_pw);

	@Select("select * from tbl_user where user_pno=#{user_pno}")
	UserDTO selectOne(int user_pno);
	
	@Insert("insert into tbl_user (user_pno, user_email, user_pw, user_nick) values (seq_user.nextval, #{user_email}, #{user_pw}, #{user_nick})")
	public int userAdd(UserDTO dto);
	
	@Update("update tbl_user set user_pw = #{user_pw}")
	public int userPwModify(String pw);

	@Update("update tbl_user set user_email = #{user_email}")
	public int userNickModify(String nick);
	
	@Delete("delete tbl_user where user_email = #{user_email}")
	public UserDTO userDelete(String user_email);

//	@Select("select sysdate from dual")
//	public String getTime();
//	public String getTime2();
	
}
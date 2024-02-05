package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.request.user.ReqUserAdd;
import com.example.demo.dto.response.user.ResUserChk;

@Mapper
public interface UserMapper {
	
	void userInsert(ReqUserAdd userInfo);	//회원가입 정보를 db에서 가져옴
	
	ResUserChk emailChk(@Param(value = "user_email") String user_email); //회원가입정보를 가져옴

																
}

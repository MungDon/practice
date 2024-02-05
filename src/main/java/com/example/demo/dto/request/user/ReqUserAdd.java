package com.example.demo.dto.request.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqUserAdd {
	
	private Long user_sid;  // 유저 sid
	
	private String user_email;	// 유저 이메일 아이디
	
	private String password;	// 유저 비밀번호
	
	private String password2;	// 유저 비밀번호 확인용
	


}

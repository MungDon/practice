package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.request.user.ReqUserAdd;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserConntroller {

	private final UserService userService;
	
	/*회원가입*/
	@GetMapping("/member") // 회원가입정보를 가져오는 매핑
	public String userForm() {  	//회원가입폼 페이지를 리턴
		return "join";
	}
	
	@PostMapping("/member")
	public String userInsert(ReqUserAdd reqData) { 
		userService.userInsert(reqData);		// 유저 회원가입 정보를 서비스에서 넘겨받음
		return "redirect:/member/login";	// 회원가입 완료 후 로그인 페이지로 리다이렉트
	}
}

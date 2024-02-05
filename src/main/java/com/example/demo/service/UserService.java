package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.user.ReqUserAdd;
import com.example.demo.dto.response.user.ResUserChk;
import com.example.demo.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserMapper usermapper;

	public void userInsert(ReqUserAdd userInfo) {
		ResUserChk emailChk = usermapper.emailChk(userInfo.getUser_email()); // 이메일중복검사를 위해 정보를 매퍼에서 가져옴
		try {
			if (emailChk != null) { // emailChk안에 이미 같은 이메일이있다면 작동
				throw new Exception("이메일이 중복 되었습니다"); // 조건문 작동시 예외 발생
			}
			if (!userInfo.getPassword().equals(userInfo.getPassword2())) { // 비밀번호와 비밀번호 재확인 정보가 다를경우 작동
				throw new Exception("비밀번호 확인 입력이 잘못되었습니다");// 조건문 작동시 예외발생
			}
			usermapper.userInsert(userInfo); // 위에 조건식 둘다 작동 안할시 여기서 컨트롤러로 정보를 넘김
		} catch (Exception e) {
			System.out.println("경고" + e.getMessage()); // 예외발생시 예외를 가져와 콘솔로 메시지 생성

		}

	}
}

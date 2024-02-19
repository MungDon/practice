     package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.product.ReqOptionAdd;
import com.example.demo.dto.request.product.ReqProductAdd;
import com.example.demo.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMapper productMapper;
	/*생산품목 등록 기능*/
	public void productAdd(ReqProductAdd reqAdd) {
		try {
			if (reqAdd.getProduct_name() == null) {// 사용자의 입력사항중 제품명 데이터를 받아와 데이터가 있는지 없는 지 체크
				throw new Exception("제품명은 필수 사항입니다 입력해주세요");//없다면 강제 예외 발생
			}
			if (reqAdd.getOptions() == null) {// 사용자의 입력사항중 옵션 데이터를 받아와 데이터 유무 체크
				throw new Exception("옵션을 등록해주세요~");//없다면 강제 예외 발생
			}
			for (ReqOptionAdd option : reqAdd.getOptions()) {//향상된 for문, 옵션의 리스트 길이만큼 반복함
				if (option.getOption_first() == null) {	//옵션리스트안에있는 옵션1번의 데이터 유무 체크
					throw new Exception("옵션1번을 정해주세요");//없다면 강제 예외 발생
				}
				if (option.getOption_first() == null) {//옵션리스트  안에 있는 옵션 2번의 데이터 유무 체크 
					throw new Exception("옵션2번을 정해주세요");   //없다면 강제예외발생
				}
			}
			productMapper.productAdd(reqAdd);//모든것이 통과 되었다면 매퍼에서 가져온 등록데이터를 저장
		} catch (Exception e) {//발생한 모든 예외를 가져옴
			System.out.println("경고" + e.getMessage());//예외 메세지를 콘솔에 출력한다.
		}

		
	}
}

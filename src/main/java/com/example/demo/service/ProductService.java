package com.example.demo.service;

import java.lang.StackWalker.Option;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.product.ReqOptionAdd;
import com.example.demo.dto.request.product.ReqProductAdd;
import com.example.demo.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductMapper productMapper;

	public void productAdd(ReqProductAdd reqAdd) {
		try {
			if (reqAdd.getProduct_name() == null) {
				throw new Exception("제품명은 필수 사항입니다 입력해주세요");
			}
			if (reqAdd.getOptions() == null) {
				throw new Exception("옵션을 등록해주세요~");
			}
			for (ReqOptionAdd option : reqAdd.getOptions()) {
				if (option.getOption_first() == null) {
					throw new Exception("옵션1번을 정해주세요");
				}
				if (option.getOption_first() == null) {
					throw new Exception("옵션2번을 정해주세요");    
				}
			}
		} catch (Exception e) {
			System.out.println("경고" + e.getMessage());
		}

		productMapper.productAdd(reqAdd);
	}
}

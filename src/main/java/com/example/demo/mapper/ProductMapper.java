package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.request.product.ReqProductAdd;

@Mapper
public interface ProductMapper {
	
	void productAdd(ReqProductAdd reqAdd); //제품 등록 데이터를 저장
}

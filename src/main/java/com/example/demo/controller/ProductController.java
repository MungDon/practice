package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.request.product.ReqProductAdd;
import com.example.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@GetMapping("/product")	
	public String productForm() {//판매자 페이지 폼 리턴
		return "product";
	}
	
	@PostMapping("/product")
	public String productAdd(ReqProductAdd reqAdd){
		productService.productAdd(reqAdd);
		return"redirect:/product/list";		
		
	}
	
}

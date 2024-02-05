package com.example.demo.dto.request.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqOptionAdd {
	
	private String option_first;		//옵션1
	
	private String option_second;		//옵션2
	
	private int stock;					//재고
}

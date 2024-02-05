package com.example.demo.dto.request.product;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqProductAdd {
	
	private Long product_sid;
	
	private Long user_sid;
	
	private String product_name;
	
	private List<ReqOptionAdd> options;
	
	private String single_color_yn;
	
	private String delete_yn;
	
	private LocalDateTime created_date;
	
	private LocalDateTime modified_date;
	
}

package com.p1k.p1kGram.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMRespDto<T>{
	
	private int statuscode;
	private T data;}
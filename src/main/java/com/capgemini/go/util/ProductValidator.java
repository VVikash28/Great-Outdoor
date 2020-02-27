package com.capgemini.go.util;

import com.capgemini.go.exception.ProductException;


public class ProductValidator {

	public static boolean ValidateProductId(String productId)throws ProductException {
	boolean flag = true;
	String id=String.valueOf(productId);
	flag=id.matches("^[a-zA-Z][0-9]+$");
	return flag;
	}


	}



package com.finserv.java.Exception;

public class CartInvalidException extends Exception{
	
	CartInvalidException(String mgs)
	{
		System.out.println("Cart Empty Exception");
	}

}

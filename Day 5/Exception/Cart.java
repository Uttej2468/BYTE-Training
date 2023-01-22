package com.finserv.java.Exception;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	
		public void addtocart(String i,String n,String p)
		{
			List<String> l=new ArrayList<String>();
			l.add(i);
			l.add(n);
			l.add(p);
		
		try {
			
		for(String s:l)
		{
			if(s==null) {
				{
					throw new CartInvalidException("There is null value in the cart");
				}
			}
		}
	}
	catch(CartInvalidException e) {
		System.out.println(e);
	}
		}
}

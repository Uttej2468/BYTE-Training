package com.finserv.java.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number =  Arrays.asList(2,3,4,5);
		List<Integer> sq = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(sq);
		
		List<Integer> number1 =  Arrays.asList(2,3,4,5);

		number1.stream().map(x->x*x).forEach(y->System.out.println(y));
		


	}

}

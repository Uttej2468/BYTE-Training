package com.finserv.java.Interface;
//import com.finserv.java.Interface.Animal;

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig ref = (num1,num2)->{
			System.out.println(num1 + num2);
		};
		ref.addition(10, 20);
	}

}

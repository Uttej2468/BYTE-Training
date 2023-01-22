package com.finserv.java.Interface;

public class Animal implements Pig,Dog{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal p =new Animal();		
		p.view1();
		p.view();
		p.pigview();

	}
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void view()
	{
		System.out.println("Dog features");
	}
	public void view1()
	{
		System.out.println("Pig Features");
	}

}

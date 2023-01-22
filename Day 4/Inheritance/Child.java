package com.finserv.java.inheritance;

public class Child extends Parent{
	int c=20,ch=9;
	public Child()
	{
		System.out.println("From Child Non Parametrized Consructor ");
	}
	public Child(int ch)
	{
		this.ch = ch;
	}
	public void show()
	{
		System.out.println(c + " " + p);
	}
	public void display()
	{
		System.out.println("From Child Class");
	}

}

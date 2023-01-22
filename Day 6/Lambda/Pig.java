package com.finserv.java.Interface;

public interface Pig {
	//public void view1();
	void addition(int a,int b);
	default public void pigview()
	{
		System.out.println("From pig view");
	}
	static void pigstaticmethod()
	{
		System.out.println("From pig static");
	}
}

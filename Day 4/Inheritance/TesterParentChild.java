package com.finserv.java.inheritance;

public class TesterParentChild {
	
	public static void main(String args[])
	{
		Child c1=new Child();
		Child c = new Child(990);
		c.show();
		System.out.print(c.ch);
		//int x= 1/0;
		//System.out.println(x);
		
	}
	public static void demo(Parent obj)
	{
		obj.display();
	}

}

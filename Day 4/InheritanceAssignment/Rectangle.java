package com.finserv.java.InheritanceAssignment;

public class Rectangle extends Base {
	int length;
	int breadth;

	public Rectangle(int length,int breadth)
	{
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
		
	}
	public double calculateArea()
	{
		return length*breadth;
	}

}

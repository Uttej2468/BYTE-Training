package com.finserv.java.InheritanceAssignment;

public class Square extends Base{

	int side;
	Square(int side){
		super("Square");
		this.side=side;
	}
	public double calculateArea()
	{
		return side*side;
	}

}

package com.finserv.java.InheritanceAssignment;

public class Circle extends Base{
	int radius;
	public Circle(int radius)
	{
		super("Circle");
		this.radius = radius;
	}
	public double  calculateArea(int r)
	{
		return r*r;
	}

}

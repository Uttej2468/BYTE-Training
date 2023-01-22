package com.finserv.java.InheritanceAssignment;
import java.util.*;
public class TesterBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("Select one of the option 1/2/3");
		int ch = sc.nextInt();
		if(ch>3 || ch<0)
		{
			System.out.println("Wrong Option choosen, choose again");
			ch=sc.nextInt();
		}
		Base obj;		
		while(ch < 0 || ch > 4)
		{
			System.out.println("Enter the Correct Option from the following menu");
			ch = sc.nextInt();
		}
		if(ch==1)
		{
			System.out.println("Enter the side of the square :- ");
			int side = sc.nextInt();
			obj = new Square(side);
			System.out.println("Area of the Square is : " + obj.calculateArea());
			
		}
		else if(ch == 2)
		{
			System.out.println("Enter the length and breadth of the Rectangle");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			obj = new Rectangle(length,breadth);
			System.out.println("Area of the Rectangle is : " + obj.calculateArea());
			
		}
		else if(ch==3)
		{
			System.out.println("Enter the radius of the circle ");
			int radius =sc.nextInt();
			obj = new Circle(radius);
			System.out.println("Area of the Circle is : " + obj.calculateArea());

		}
		sc.close();
	}

}

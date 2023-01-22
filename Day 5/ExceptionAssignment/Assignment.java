package com.finserv.java.ExceptionAssignment;
import java.util.*;
public class Assignment {
	//41 Question 
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int r = a%b;
		Division obj=new Division();
		System.out.println(" Quotient is :- " + (a-r)/b);
		System.out.println(a/b);
		int n = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(n/d);

		try {
			obj.division(a,b);
			
		}
		catch(Exception e)
		{
			System.out.println("DivideByZeroException");
		}
		finally
		{
			System.out.println("From Final Block");
		}
		
	}

}

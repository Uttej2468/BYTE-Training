package com.finserv.java;
import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Assignment a=new Assignment();
		a.maxof3(1,4,8);
		a.swap(10,20);
		a.swap_without(10,01);
		a.numcheck(-7);
		a.primecheck(3);
		a.PallindromeCheck(101);
		cube(3);
		sc.close();

	}
	public void maxof3(int x,int y,int z)
	{
		int largest = z > (x>y ? x:y) ? z:((x>y) ? x:y); 
		System.out.println(largest);

	}
	public void swap(int a,int b)
	{
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b);
		
	}
	public void swap_without(int a, int b)
	{
		a = a +b;
		b = a-b;
		a= a-b;
		System.out.println(a+ " " + b);
	}
	public void numcheck(int n1)
	{
		if(n1 > 0)
		{
			System.out.println("Positive");
		}
		if(n1 < 0)
		{
			System.out.println("Negative");
		}
		if(n1 == 0)
		{
			System.out.print("Zero");
		}
	}
	public void primecheck(int n1)
	{
		int s=0;
		for(int i=1 ;i<=n1;i++)
		{
			if(n1%i==0)
			{
				s++;
			}
		}
		if(s==2 || n1==2)
		{
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
	}
	
	public void PallindromeCheck(int n)
	{
		int t,s=0,r;
		t =n;
		while(n>0)
		{
			r = n%10;
			s = s*10 + r;
			n = n/10;
		}
		if(t==n)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
	}
	public static void cube(int n)
	{
		System.out.println(n*n*n);
	}

}

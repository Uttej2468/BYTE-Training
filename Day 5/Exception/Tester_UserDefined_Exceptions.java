package com.finserv.java.Exception;

public class Tester_UserDefined_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	
	try {
		
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		throw new NullPointerException();
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	throw new FileNotFoundException();

}
catch(FileNotFoundException e)
{
	System.out.println(e);
}
	}

}

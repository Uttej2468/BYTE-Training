package com.finserv.java.Exception;
public class Voter {
	public void validate_age(int n) 
	{
		try {
			if(n<19)
			{
				throw new AgeInvalid_Exception("Invalid age exception raised from try");
			}
		}
		catch(AgeInvalid_Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid from catch");
			//e.printStackTrace();
		}
	}
	public void enjoy()
	{
		System.out.println("fun");
	}
	

}

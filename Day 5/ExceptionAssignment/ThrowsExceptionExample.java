package com.finserv.java.ExceptionAssignment;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 class ThrowsExceptionExample {
	//41 and 42 Question
	 public static void main(String[] args) throws IOException,FileNotFoundException{
		
		try
		{
			FileReader fr= new FileReader("Text.txt");
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found from 1st catch");
			//e.printStackTrace();
		}
		catch(IOException  e)
		{
			System.out.println("Io exception from 2nd catch ");
		}
				
	}

}

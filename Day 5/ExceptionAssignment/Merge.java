package com.finserv.java.ExceptionAssignment;


//Java program to merge two
//files into third file

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Merge
{
	public  void temp() throws IOException
	{
		try { //
			PrintWriter pw = new PrintWriter("file3.txt");
			BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
			
			String line = br.readLine();
			while (line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			
			br = new BufferedReader(new FileReader("file2.txt"));
			line = br.readLine();
			while(line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			
			pw.flush();
			
			// 46.Question closing resources
			br.close();
			pw.close();
			
			System.out.println("Merged file1.txt and file2.txt into file3.txt");

		}
		catch(FileNotFoundException e){
			System.out.println("Error From Catch " + e);
			
		}
			}
}


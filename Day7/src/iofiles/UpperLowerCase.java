package iofiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperLowerCase {

	public static void main(String[] args) 
	{
		try
		{
			File f = new File("E:\\MyPreparation\\3.txt");
			 
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter wr = new BufferedWriter(new FileWriter("E:\\MyPreparation\\Ucase.txt"));  
			BufferedWriter wr1 = new BufferedWriter(new FileWriter("E:\\MyPreparation\\Lcase.txt"));  
			String i;  
		    while((i=br.readLine())!=null)
		    {    
		          wr.write(i.toUpperCase());
		          wr1.write(i.toLowerCase());
		    }    
		    System.out.println("Contents in the file are converted to Lower and upper cases and written in respective files successfully.");
		    wr.close();
		    wr1.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}

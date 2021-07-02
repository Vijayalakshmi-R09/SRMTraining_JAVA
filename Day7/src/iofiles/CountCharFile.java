package iofiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharFile {

	public static void main(String[] args) {
		try 
		{
			File f = new File("E:\\MyPreparation\\3.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
		    String i;  
		    String[] words=null;
		    int vcount=0;
		    int wcount=0;
		    int count=0;
		    System.out.println("File Contents:");
		    while((i=br.readLine()) != null)
		    {    
		    	System.out.println((i+"\n"));
		    	count+=i.length();
		    	words=i.split(" ");
		    	wcount+=words.length;
		    	
		    	for(int j=0;j<words.length;j++)
		    	{
		    		for(int k=0;k<words[j].length();k++)
		    		{
		    			char ch=words[j].charAt(k);
		    			Character.toLowerCase(ch);
		    			if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')  
		                {
		                       vcount+=1; 
		                }
		             }
		    	}		    	  
	        }  
		    System.out.println("Characters in the Text file: "+count);
		    System.out.println("Vowels in the Text file: "+vcount);
		    System.out.println("Words in the Text file: "+(wcount-1));
		    br.close();
	    } 
		catch (IOException e) 
		{
			e.printStackTrace();
		}    

	}

}

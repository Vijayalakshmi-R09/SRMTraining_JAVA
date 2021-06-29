package iofiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFile {

	public static void main(String[] args) throws IOException 
	{
		try 
		{
			File f=new File("E:\\MyPreparation\\3.txt");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("E:\\MyPreparation\\write1.txt");
			int i;
			while ((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			System.out.println("File Copy compleleted...check in directory");
			fis.close();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

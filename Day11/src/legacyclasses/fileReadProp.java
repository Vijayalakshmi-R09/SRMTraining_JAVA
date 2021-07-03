package legacyclasses;

import java.io.FileReader;
import java.util.Properties;

public class fileReadProp {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("‪propread.properties");
			Properties p2=new Properties(); 
			p2.load(reader);
			System.out.print(p2.getProperty("When"));  
		    System.out.print(p2.getProperty("Msg")); 
		    reader.close();
		}catch(Exception io)
		{
			System.out.println(io);
		}

	}

}

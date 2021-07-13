package regexprmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public Client() {
	
	}

	public static void main(String[] args) 
	{
		try 
		{ 
			Registry registry = LocateRegistry.getRegistry(null); 
	    
			Message stub = (Message) registry.lookup("Message"); 
    
			stub.printMsg();         
		} 
		catch (Exception e) 
		{
	    	 System.err.println("Client exception: " + e.toString()); 
	         e.printStackTrace();
		}
	}
}

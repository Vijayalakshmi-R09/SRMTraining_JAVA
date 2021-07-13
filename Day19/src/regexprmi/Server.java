package regexprmi;
import java.rmi.RemoteException; 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Imple
{
	public Server()
	{
		
	}

	public static void main(String[] args) 
	{
		try 
		{ 
			Imple obj = new Imple(); 
	        Message stub = (Message) UnicastRemoteObject.exportObject(obj, 0);  
	        Registry registry = LocateRegistry.getRegistry(); 
	        registry.bind("Message", stub);  
	        System.err.println("Server ready"); 
	      } catch (Exception e)
		  { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	   } 
	} 

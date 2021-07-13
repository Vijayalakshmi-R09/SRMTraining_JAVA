package regexprmi;

import java.rmi.RemoteException;

public class Imple implements Message 
{

	@Override
	public void printMsg() throws RemoteException
	{
		System.out.println("RMI Example"); 
	}

}

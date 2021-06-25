package exceptionhandl;

public class MarksOutOfBoundException extends Exception
{
	public MarksOutOfBoundException(String msg)
	{
		super(msg);
		System.out.println(msg);
	}
}

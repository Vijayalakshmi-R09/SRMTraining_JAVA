package exceptionhandl;

public class PayOutOfBoundsException extends Exception
{
	public PayOutOfBoundsException(String msg)
	{
		super(msg);
		System.out.println(msg);
	}
}

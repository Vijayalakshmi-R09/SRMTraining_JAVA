package exceptionhandl;

public class Employee 
{
	int empno;
	String empName;
	double bPay;
	public Employee(int empno, String empName, double bPay) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.bPay = bPay;
	}
	public void calcBasicPay() throws PayOutOfBoundsException
	{
		if(bPay<=0 || bPay<2500)
		{
			String s="Invalid Basic Pay\nDidnt Satisfy Minimum entry... ";
			throw new PayOutOfBoundsException(s);
		}
		else
		{
			System.out.println("Employee Details: \n Employee No: "+empno+"\n Employee Name: "+empName+"\n BasicPay: "+bPay);
		}
	}
}

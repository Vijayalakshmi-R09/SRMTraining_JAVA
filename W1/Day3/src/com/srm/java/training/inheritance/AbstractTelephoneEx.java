package com.srm.java.training.inheritance;
abstract class Telephone
{
	abstract void lift();
	abstract void disconnected();
}
class SmartTelephone extends Telephone
{
	@Override
	void lift() {
		System.out.println("Please lift the telephone.");
		
	}

	@Override
	void disconnected() {
		System.out.println("The call is disconnected.");
		
	}
	
}
public class AbstractTelephoneEx {

	public static void main(String[] args) {
		SmartTelephone st=new SmartTelephone();
		System.out.println("Telephone serv..\n");
		st.lift();
		st.disconnected();
	}

}

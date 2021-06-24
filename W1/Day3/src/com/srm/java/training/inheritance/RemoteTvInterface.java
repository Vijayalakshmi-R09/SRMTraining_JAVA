package com.srm.java.training.inheritance;

class TV implements SmartTVRemote
{
	@Override
	public void On() {
		System.out.println("Swtich on the TV");
	}

	@Override
	public void Off() {
		System.out.println("Swtich off the TV");
	}

	@Override
	public void onlineStream() {
		System.out.println("Online streaming available in SmartTV");
	}

	@Override
	public void record() {
		System.out.println("Recording option available in SmartTV");
	}

	@Override
	public void games() {
		System.out.println("Play Fun smartTV games");
	}
	
}
public class RemoteTvInterface {

	public static void main(String[] args) {
		TV tv=new TV();
		System.out.println("Tv features");
		System.out.println("------------------");
		tv.On();
		tv.Off();
		System.out.println("\nSmartTv features");
		System.out.println("------------------");
		tv.onlineStream();
		tv.record();
	}
}
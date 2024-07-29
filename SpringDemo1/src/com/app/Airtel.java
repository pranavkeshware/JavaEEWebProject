package com.app;

public class Airtel implements Sim {

	public Airtel()
	{
		System.out.println("In Default Constructor of Airtel");
	}

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using airtel sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing using airtel sim");
	}

}

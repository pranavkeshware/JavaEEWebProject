package com.app;

public class Vodafone implements Sim {
	
	public Vodafone()
	{
		System.out.println("In Defaul Constructor of Vodafone");
	}

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using vodafone sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing using vodafone sim");
	}
    
}

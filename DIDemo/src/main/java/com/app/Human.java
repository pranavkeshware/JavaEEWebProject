package com.app;

public class Human {

	private Heart heart;

	public Human() {
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void pumping() {
	
		if (heart != null)
		{
			heart.pump();
		}
		else 
		{
			System.out.println("You are dead");
		}
	}
}

package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	     
	     Sim sim = context.getBean(Sim.class,"Sim");
	     sim.Calling();
	     sim.data();
	}

}

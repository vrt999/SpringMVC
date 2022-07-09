package com.SpringMVCPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
			//beans.xml should be present in src/main/resources path for Spring mvc or web apps
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			
			//using constructor arg in beans.xml
			Airtel sim = (Airtel) context.getBean("airtel");
			String name = sim.getName();
			System.out.println("name:"+name);			
			sim.calling();
			sim.data();
			
			//using property in beans.xml
			Idea idea = context.getBean("idea",Idea.class);
			String name1 = idea.getName();
			System.out.println("name1:"+name1);			
			idea.calling();
			idea.data();

	}

}

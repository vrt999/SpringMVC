package com.SpringMVCPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//All the beans will be created with this line so constructor calls happen for all of them
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
/*		User user1 = context.getBean("Ravi",User.class);
		user1.getId();
		User user2 = context.getBean("Teja",User.class);
		user2.getId();
		user2.userCalling();*/
		AutowireUser autowireuser = context.getBean("autowireuser",AutowireUser.class);
		autowireuser.userCalling();
	}

}

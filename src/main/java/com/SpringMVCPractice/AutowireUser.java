package com.SpringMVCPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowireUser {
	// Setter method isnot called when we use the @Autowired annaotation at variable level
	@Autowired
	@Qualifier("idea1")
	Sim sim;
	
	public AutowireUser() {
		System.out.println("AutowireUser default constructor called");
	}
	
	/*If u r using @Autowired annotation <context:annotation-config/> this tag should be present in the configuration xml
	If @Autowired annotation is not used and u want to use constructor for bean creation then autowire="constructor" should
	 be present in the autowireuser bean tag
	If dependency type and bean type is same autowire="byType" can be used, here setSim will be called for sim variable value
	If many dependencies are there for same type then make dependency name and bean ID is same autowire="byName" can be used, here setSim will be called for sim variable value
	Autowiring isnot possible for primitive and String variable types*/
/*	@Autowired
	public AutowireUser(Sim sim) {
		System.out.println("Autowireuser parameter constructor called");
		this.sim = sim;
	}*/
	
/*	public void setId(String id) {
		Id = id;
	}
	
	public String getId() {
		System.out.println("Id value: " +Id);
		return Id;
	}*/

	public void userCalling() {
		sim.calling();
	}

	public Sim getSim() {
		return sim;
	}


//	When Autowired is used first it searches for byType and it has many then it will check for byName
	// if still we want to specify particular bean we use @Qualifier to mention the required ID of the bean*/
//  @Autowired
/*	public void setSim(Sim sim) {
		this.sim = sim;
	}*/

}


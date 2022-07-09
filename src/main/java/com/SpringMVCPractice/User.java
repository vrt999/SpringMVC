package com.SpringMVCPractice;

public class User {
	
	Sim sim;
	String Id;	
	
	public User() {
		System.out.println("User default constructor called");
	}
	
	public User(String Id,Sim sim) {
		this.Id = Id;
		this.sim = sim;
		System.out.println("User parameter constructor called");
	}
	
	public void setId(String id) {
		Id = id;
	}
	
	public String getId() {
		System.out.println("Id value: " +Id);
		return Id;
	}

	public void userCalling() {
		sim.calling();
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

}

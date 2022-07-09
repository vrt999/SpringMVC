package com.SpringMVCPractice;

public class Airtel implements Sim {
	
	public String name;
	
	public Airtel() {
		System.out.println("Airtel Default Constructor called");
	}

	public Airtel(String name) {
		this.name = name;
		System.out.println("Airtel parameter Constructor called");
	}

	public String getName() {
		return name;
	}	
	
	public void calling() {
		System.out.println("This is Airtel calling");
	}
	
	public void data() {
		System.out.println("This is Airtel data");
	}
	

}

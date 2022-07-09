package com.SpringMVCPractice;

public class Idea implements Sim {
	
	public String name;
	
	public Idea() {
		System.out.println("Idea Default Constructor called");
	}
	
	public Idea(String name) {
		this.name = name;
		System.out.println("Idea parameter Constructor called");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
	
	public void calling() {
		System.out.println("This is Idea calling");
	}
	
	public void data() {
		System.out.println("This is Idea data");
	}
	

}


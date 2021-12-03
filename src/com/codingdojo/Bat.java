package com.codingdojo;

public class Bat extends Mammal {
	
	public Bat(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
		
		}
	
	public int fly() {
		System.out.println("Woosh");
		return energyLevel -= 50;
	}
	
	public int eatHumans() {
		System.out.println("Human being eaten: I die.");
		return energyLevel += 25;
	}
	
	public int attackTown() {
		System.out.println("Attack Town!");
		return energyLevel -= 100;
	}
	
	
	}
	


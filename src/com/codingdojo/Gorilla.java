package com.codingdojo;

public class Gorilla extends Mammal {


	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public int throwSomething() {
		System.out.println("the gorilla has thrown something");
		return energyLevel -= 5;
	}
	
	public int eatBananas() {
		System.out.println("ndicating the gorilla's satisfaction");
		return energyLevel += 10;
	}
		
	
	public int climb() {
		System.out.println("The Gorilla tried to climb the fence");
		return energyLevel -= 10;
	}
	
}

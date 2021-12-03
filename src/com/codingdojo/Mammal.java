package com.codingdojo;

public class Mammal {
	public int energyLevel;
	
	public Mammal (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
		
	


}

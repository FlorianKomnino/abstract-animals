package org.java;

public abstract class Animal {
	
	public Animal() {};
	
	public void dormi() {
		System.out.println("ZzZ");
	}
	
	public abstract void verso();
	public abstract void mangia();
}

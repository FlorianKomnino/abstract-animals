package org.java;

public class Passerotto extends Animal implements Fly {

	private String food = "seeds";
	private String sound = "Cip Cip";
	
	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println(sound);
	}
	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("This animal eats " + food + "!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This animal is a sparrow" 
				+ "\nIt eats " + food
				+ "\nIt's sound is \"" + sound + "\""
				+ "\n---------------------------------";
	}
	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Sto volando!!!");
	}
}

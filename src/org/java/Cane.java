package org.java;

public class Cane extends Animal implements Swim {

	private String food = "meat";
	private String sound = "Bau";
	
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
		return "This animal is a dog" 
				+ "\nIt eats " + food
				+ "\nIt's sound is \"" + sound + "\""
				+ "\n---------------------------------";
	}
	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("Sto nuotando!!!");
	}
}

package org.java;

public class Aquila extends Animal implements Fly {

	private String food = "meat";
	private String sound = "kiaaaaaaaa";
	
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
		return "This animal is an eagle" 
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

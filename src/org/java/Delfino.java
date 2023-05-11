package org.java;

public class Delfino extends Animal implements Swim {

	private String food = "small fishes";
	private String sound = "He He He He He";
	
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
		return "This animal is a dolphin" 
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

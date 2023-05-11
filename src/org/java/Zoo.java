package org.java;

public class Zoo {
	public static void main(String[] args) {
		Animal c1 = new Cane();
		Animal p1 = new Passerotto();
		Animal a1 = new Aquila();
		Animal d1 = new Delfino();
		
		System.out.println(c1);
		System.out.println(p1);
		System.out.println(a1);
		System.out.println(d1);
		System.out.println("\n-------------------");
		System.out.println("\n-------------------");
		
		Animal[] animalArr = new Animal[]{c1, p1, a1, d1 };
		
		for (int i=0; i<animalArr.length; i++) {
			Animal anim = animalArr[i];
			anim.verso();
			
			if (anim instanceof Swim) {
				System.out.println("In its natural habitat it says:");
				AnimalManager.faiNuotare((Swim) anim);
				System.out.println("---------------------------------");
			} else if (anim instanceof Fly) {
				System.out.println("In its natural habitat it says:");
				AnimalManager.faiVolare((Fly) anim);
				System.out.println("---------------------------------");
			}
		}
	}
}

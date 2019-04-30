package day07_scanner_operators;

public class EnoughPizza {

	public static void main(String[] args) {
		//slices in pizza - 8
		//slices per student - 2
		
		int pizzaCount = 150;
		int studentsCount = 145;
		int pizzaSlices = 240;
		
		
		System.out.println(pizzaCount * 8);
		System.out.println(pizzaSlices / 2);
		
		boolean isEnoughPizza = (studentsCount >= pizzaSlices);
		System.out.println("Is there enough pizza? " + isEnoughPizza);
		
		
		
		
		
	}

}

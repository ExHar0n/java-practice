package day42_custom_classes_encapsulation;

import java.util.*;

public class DSWShoeStore {

	public static void main(String[] args) {
		Shoes shoes1 = new  Shoes();
		shoes1.setShoesData("ALDO", 12.5);
		System.out.println(shoes1.getShoesData());
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Allen Edmonds", 7.5);
		
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("BOSS HUGO BOSS", 9.0);
		
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(shoesArray[1].brand);
		
		for(Shoes shoes : myShoes) {
			if(shoes.size > 7) {
				System.out.println(shoes.brand);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		Shoes scanShoes = new Shoes();
		scanShoes.setShoesData(brand, size);
		System.out.println(scanShoes.getShoesData());
		
		
		

	}

}

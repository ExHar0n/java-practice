package day43_encapsulation_constractor;

import java.lang.reflect.Array;

public class MicroCenter {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		comp1.setBrand("iMac");
		comp1.setOs("mac OS High Sierra");
		comp1.setPrice(2567);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1300);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		Computer comp3 = new Computer("Mac", "High sierra", 1500.50);
		System.out.println(comp3.toString());

		
		comp3.setPrice(1200);
		comp3.setOs("Maverik");
		System.out.println(comp3.toString());
		
	}

}

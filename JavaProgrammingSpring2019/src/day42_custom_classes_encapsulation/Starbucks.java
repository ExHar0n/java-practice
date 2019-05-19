package day42_custom_classes_encapsulation;

import java.util.*;

public class Starbucks {

	public static void main(String[] args) {
		
		WarmUp[] coffeeArray = new WarmUp[2];
		coffeeArray[0] = new WarmUp();
		coffeeArray[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		coffeeArray[0].getCoffeeInfo();
		
		WarmUp latte = new WarmUp();
		latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		
		coffeeArray[1] = latte;
		
		coffeeArray[1].getCoffeeInfo();
	}

}

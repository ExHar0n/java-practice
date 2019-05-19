package day42_custom_classes_encapsulation;

public class WarmUp {

	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase() + " " + size.toUpperCase() + " $" + price + " " + calories + " CAL";
		System.out.println(info);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCalories) {
		name = newName;
		size = newSize;
		price = newPrice;
		calories = newCalories;
	}
	
	public static void main(String[] args) {
		WarmUp coffee1 = new WarmUp();
		coffee1.name = "ICED CARAMEL MACCIATO";
		coffee1.size = "GRANDE";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		
		coffee1.getCoffeeInfo();
		
		WarmUp coffee2 = new WarmUp();
		coffee2.setName("JAVA CHIP");
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
	}

}

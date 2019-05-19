package day40_arrayList_practice;

public class CellPhone {

	String brand;
	double screenSize;
	String color;
	double price;
	
	public static void main(String[] args) {
		
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		cell1.brand = "Nokia 6200";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.60;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("screen size: " + cell1.screenSize);
		System.out.println("color: " + cell1.color);
		System.out.println("price: " + cell1.price);
		
		cell1.color = "Black";
		System.out.println("color: " + cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("##### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		System.out.println("price: " + cell2.price);
		
		

	}

}

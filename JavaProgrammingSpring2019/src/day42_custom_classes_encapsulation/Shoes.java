package day42_custom_classes_encapsulation;

public class Shoes {

	String brand;
	double size;
	
	public void setShoesData(String newBrand, double newSize) {
		brand = newBrand;
		size = newSize;
	}
	
	public String getShoesData() {
		return "Brand: [" + brand + "], size: [" + size + "]";
	}

}

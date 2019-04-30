package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		System.out.println("i = " + i); //3
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println(price);
		System.out.println(dollars);
		
		// Whole Numbers. byte, short, int
		
		int count = 244;
		byte byteCount = (byte)count;
		System.out.println(byteCount);
		
		long longValue = 345636L;
		int intValue = (int)longValue;
		
		System.out.println(intValue);
		
		
		
	}
}

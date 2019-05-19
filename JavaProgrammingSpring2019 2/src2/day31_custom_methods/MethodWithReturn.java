package day31_custom_methods;

public class MethodWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		System.out.println(giveMeYourName());
	}
	
	public static int giveMe10$ () {
		System.out.println("returning 10 from method");
		return 10;		//this method returns int value
	}
	
	public static String giveMeYourName () {
		return "Murodil";
	}

}

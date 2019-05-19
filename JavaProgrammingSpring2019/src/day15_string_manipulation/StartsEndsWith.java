package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		
		String name = "Mr. Jackson";
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}


	}

}

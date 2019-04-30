package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(java.lang.String[] args) {
		String str1 = "java";
		String str2 = "java";
		//using ==
		System.out.println(str1 == str2); //true
		System.out.println(str1 == "java"); //true
		System.out.println(str2 == "Java"); //true
		
		//equals method  <----- Prefered way
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str1.equals("Java"));
		System.out.println(str1.equalsIgnoreCase("Java"));
	}

}

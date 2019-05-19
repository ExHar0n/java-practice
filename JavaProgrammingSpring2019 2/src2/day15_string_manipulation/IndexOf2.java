package day15_string_manipulation;

public class IndexOf2 {

	public static void main(String[] args) {
		
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash);

		int thirdDash = list.indexOf("-", 14);
		System.out.println("Third dash: " + thirdDash);
		
		int lastDash = list.lastIndexOf("-");			// last position of the character / string
		System.out.println("Last dash: " + lastDash);
		
		
	}

}

package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		int codeCount;
		String sentence = "I wrote [1236] lines of code today";
		System.out.println(sentence.substring(sentence.indexOf('[') + 1,sentence.indexOf(']')));

		
		int count = Integer.parseInt("10");
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code today!!!");
		}else {
			System.out.println("Not enough coding for today.");
		}
	}

}

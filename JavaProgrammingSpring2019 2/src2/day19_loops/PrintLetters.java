package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		
		String word = "Amazon";
		int idx = 0;
		while(idx<word.length()) {
			System.out.println(word.charAt(idx));
			idx++;
		}

	}

}

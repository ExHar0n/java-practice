package day26_Arrays04;

public class Split {

	public static void main(String[] args) {

		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search result total: " + diceArray[4]);
		
		String[] diceArray2 = diceResult.split("of ");
		System.out.println(diceArray2[1]);
		System.out.println(diceArray2[0].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
		System.out.println("All words: ");
		for(String w : allWords) {
			System.out.print(w);
		}
		System.out.println("After happy split: ");
		for(String w : happySplit) {
			System.out.println(w);
		}
		System.out.println("After I split: ");
		for(String w : ISplit) {
			System.out.println(w);
		}

		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch : charsArray) {
			System.out.println(ch);
		}
	}

}

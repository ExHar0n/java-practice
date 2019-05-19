package day16_string_manipulation;

public class Sentence {

	public static void main(String[] args) {
		String sentence = ",";
		System.out.println(sentence);
		sentence = sentence.replace(",","!!!");
		System.out.println(sentence);
		
		String mixed = "&%*j$a-v|$a#$%";
		mixed = mixed.replace("$","");
		mixed = mixed.replace("&","");
		mixed = mixed.replace("*","");
		mixed = mixed.replace("%","").replace("-", "").replace("|", "").replace("#", "");
		System.out.println(mixed);
		
		String result = "About 115,000,000 results (0.66 seconds)";
		result = result.replace("About ", "");
		result = result.replace(",","");
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		
	}

}

package mentoring_session_1;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		System.out.println("Enter the month");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		String message = "";
	/*	if(value >= 1 && value <= 2 || value == 12) {
			System.out.println("Winter");
		}else if(value >= 3 && value <= 5) {
			System.out.println("Spring");
		}else if(value >= 6 && value <= 8) {			If else
			System.out.println("Summer");
		}else if(value >= 9 && value <= 11) {
			System.out.println("Autumn");
		}else {
			System.out.println("Invalid value!");
		}	*/
		
		switch(value) {
			case 1:case 2:case 12:
				message = "Winter";
				break;
			case 3:case 4:case 5:
				message = "Spring";
				break;
			case 6:
				message = "Summer";
				break;
			case 7:
				message = "Summer";
				break;
			case 8:
				message = "Summer";
				break;
			case 9:
				message = "Fall";
				break;
			case 10:
				message = "Fall";
				break;
			case 11:
				message = "Fall";
				break;
			default:
				message = "Invalid value";
		}
		
		System.out.println(message);

	}

}

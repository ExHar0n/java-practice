package day10_logical_operators_conditions;

public class IFStatementWithBooleanVariables {

	public static void main(String[] args) {
		
		boolean isBreakTime = true;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not break time yet.");
		}

		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not break time yet.");
		}
		
		boolean isNiceWeather = false;
		
		if(!isNiceWeather) { 									//true
			System.out.println("Don't go out for running");
		}else {
			System.out.println("Let's go out for running");
		}
		
	}

}

package day08_casting_conditionals;

public class IfElseWithVariables {

	public static void main(String[] args) {
		int temperature = 45;

		if (temperature >= 65) {
			System.out.println("It's a nice day! Let's code java");
		} else {
			System.out.println("Stay home and code java");
		}
		// 2 int variables, teamAScore, teamBScore
		// put a condition if teamA won.

		int teamAScore = 15;
		int teamBScore = 15;

		if (teamAScore > teamBScore) {
			System.out.println("Team A Won!");
		} else {
			System.out.println("Team B Won! or it was a drawn");
		}
	}

}

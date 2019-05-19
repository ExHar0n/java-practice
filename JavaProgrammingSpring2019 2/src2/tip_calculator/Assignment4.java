package tip_calculator;

import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
		 
		char[][] tictactoe = new char[3][3];
	    for(int i = 0; i < tictactoe.length; i++){
	    	for(int j = 0; j< tictactoe.length; j++) {
	    		tictactoe[i][j] = ' ';
	    	}
	    }
	    System.out.println(Arrays.deepToString(tictactoe));
	
	}

}

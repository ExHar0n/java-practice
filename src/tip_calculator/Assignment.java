package tip_calculator;

import java.util.*;

public class Assignment {

	public static void main(String[] args) {
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    String [] fewValues = new String[3];
	    for(int i = 0; i < fewValues.length; i++){
	      if(arr[i].contains("e")) {
	    	  fewValues[i] = arr[i];
	      }
	    }
	    
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;

		

	}
}

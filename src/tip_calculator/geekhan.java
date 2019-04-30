package tip_calculator;

import java.util.*;

public class geekhan {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s) {
	    /*
			 * Write your code here.
			 */
			 
			 String [] time = s.split(":");
			 time[3] = time[3].substring(0,2);
			 System.out.print(Arrays.toString(time));
			 
			 
  }
}
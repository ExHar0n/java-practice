package day34_methods06;

import java.util.Arrays;
import java.util.Scanner;

public class sum {
		
		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				
				String output [] = info.split(",");
				System.out.print(Arrays.toString(output));
				
			
			}//end person
}
		  
package tip_calculator;

import java.util.*;

public class Assignment {
	
	public static void main(String[] args) {
		
		System.out.println(blackjack(19, 22));
		
	}

	public static int blackjack(int a, int b) {
		  int ab = a - b;
		  int ba = b - a;
		  if(ab < ba && b <= 21) return b;
		  if(ab > ba && a <= 21) return a;
		  if(a > 21 && b > 21) return 0;
		  return b;
		}

}

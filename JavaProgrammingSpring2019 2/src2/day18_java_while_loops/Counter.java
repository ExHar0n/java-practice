package day18_java_while_loops;

public class Counter {

	public static void main(String[] args) throws InterruptedException{
		
		int num = 0;
		while(num < 10) {
			num++;
			System.out.print(num+",");
			Thread.sleep(400);
		}
		
		System.out.println("");
		
		int num2 = 11;
		while(num2 > 1) {
			num2--;
			System.out.print(num2+",");
			Thread.sleep(200);
		}

	}

}

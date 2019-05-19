package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 10;
		int num2 = num++;
		
		
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		
		int n = 20;
		int n2 = ++n;
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
		
		int i =10;
		i++;
		++i;
		System.out.println("I value: " + i);
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
					
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);
		System.out.println("oldBatteries: " + oldBatteries);
		System.out.println("totalBatteries " + totalBatteries);
		
		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		System.out.println("Read messages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		int unreadMessages = readMessages--;
		
		System.out.println("unread Messages: " + unreadMessages);  //11
		System.out.println("readMessages: " + readMessages);		//10
		
		int total = unreadMessages++ + readMessages--;	
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages" + readMessages);
		System.out.println("total: " + total);
		
		int count = 20;  			//21+9=30
		int count2 = 10;
		
		int totalCount = ++count + --count2;
		System.out.println("count: " + count);
		System.out.println("count2: " + count2);
		System.out.println("totalCount: " + totalCount);
		
		int myCount = count++ + ++count;
		System.out.println("count: " + count);
		System.out.println("myCount: " + myCount);
	}
}

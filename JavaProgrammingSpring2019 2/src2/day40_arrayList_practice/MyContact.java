package day40_arrayList_practice;

public class MyContact {

	public static void main(String[] args) {
		
		Contact contact1 = new Contact();
		contact1.name = "Evgenia Jaliliva";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "Evgenia@thorlabs.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-3222";
		orhan.email = "orhan@google.com";
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();

	}

}

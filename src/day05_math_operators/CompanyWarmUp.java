package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		String companyName = "Facebook";
		String address = "Silicone Valley, CA";
		int numberOfEmployees = 10000;
		int revenue = 4000000;
		boolean isTechCompany = true;
		
		System.out.println("Company name is " + companyName);
		System.out.println("address is " + address);
		System.out.println("Number of empoyees is " + numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("Is is tech company? " + isTechCompany);
		
		String aboutCompany = "Company "+companyName+" is located in "+address;
		System.out.println(aboutCompany);
	}
}

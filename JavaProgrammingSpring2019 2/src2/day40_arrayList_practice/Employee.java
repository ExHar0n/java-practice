package day40_arrayList_practice;

public class Employee {

	public String name;
	public String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " is working hard...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending meeting...");
	}
	
	public void introduce() {
		System.out.println("Name [" + name + "], job title [" + jobTitle + "] salary " + salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 120000.2;
	

	}

}

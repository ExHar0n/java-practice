package day44_constructor02;

import java.util.*;

public class Dice {

	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("SDET");
		Job job3 = new Job("Developer", "Apple", 120000.50);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//Create list of jobs
		
		List<Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 123000));
		jobsList.add(new Job("SDET", "FreddieMac", 100000));
		jobsList.add(new Job("BA", "Leidos", 98000));
		jobsList.add(new Job("Senior QA tester", "Delta", 125000));
		
		System.out.println(jobsList.toString());
		
		double maxSalary = 0;
		int highestIndex = -1;
		
		for(int i = 0; i < jobsList.size(); i++) {
			if(jobsList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		
		Job bestJob = jobsList.get(highestIndex);
		System.out.println("Highest Salary: " + bestJob.toString());
		
		
	}

}

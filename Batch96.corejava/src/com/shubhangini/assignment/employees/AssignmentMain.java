package com.shubhangini.assignment.employees;

	import com.shubhangini.assignment.employees.Manager;
	import com.shubhangini.assignment.employees.Developer;
	import com.shubhangini.assignment.utilities.EmployeeUtilities;
	public class AssignmentMain {
		public static void main(String[] args) {
	        // Creating a Manager instance
	        Manager manager = new Manager();
	        manager.setName("shubhangini");
	        manager.setEmployeeId(148);
	        manager.setSalary(85000);
	        manager.setDepartment("finance");

	        // Creating a Developer instance
	        Developer developer = new Developer();
	        developer.setName("swati");
	        developer.setEmployeeId(120);
	        developer.setSalary(85000);
	        developer.setProgrammingLanguage("Java");

	        // Using EmployeeUtilities methods or functions
	        EmployeeUtilities.increaseSalary(manager, 10);  // Increasing salary by 10%
	        EmployeeUtilities.increaseSalary(developer, 15);  // Increasing salary by 15%

	        // Printing employee details by passing manager or developer instance 
	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);
	    }
	}


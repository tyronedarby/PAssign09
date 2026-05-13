/**
 * File: Employee.java
 * Class: 1302
 * Author: Tyrone Darby
 * Created: April 25, 2026
 * Description: Create a employee class
*/

import java.io.Serializable;

public class Employee implements Serializable{
		private String name;
		private double salary, yearsOfService;
		
		// Create constructor 
		public Employee(String name, double salary, double yearsOfService) {
			setName(name);
			setSalary(salary);
			setYearsOfService(yearsOfService);
		}
		
		// Calculate salary raise
		public double processRaise(double raise) {
			double raiseAmount = 0.0;
			raiseAmount = (raise / 100 * getSalary()) + getSalary();
			return raiseAmount;
		}
		
		@Override
		public String toString() {
			return String.format("Name: %s\nSalary: $%.2f\nYears of Service: %.1f", getName(), getSalary(), getYearsOfService());
		}

		// Getters and Setters
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public double getYearsOfService() {
			return yearsOfService;
		}
		
		public void setYearsOfService(double yearsOfService) {
			this.yearsOfService = yearsOfService;
		}
		
	}
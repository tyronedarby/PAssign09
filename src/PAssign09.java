/**
 * File: PAssign09.java
 * Class: 1302
 * Author: Tyrone Darby
 * Created: April 25, 2026
 * Description: Read and write employee data to binary IO files.
*/

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PAssign09{
	
	public static void main(String[] args) {
		// Create input and output files
		try(
				DataInputStream input = new DataInputStream(new FileInputStream("src/employeeData.dat"));
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/employeeDataProcessed.dat"));
				) {
			
			String name;
			double salary, yearsOfService, newSalary;
			// Read data for each employee
			while(true) {
				name = input.readUTF();
				salary = input.readDouble();
				yearsOfService = input.readDouble();
				
				//System.out.printf("%s $%.2f %.1f ", name, salary, yearsOfService);
				
				Employee employee = new Employee(name, salary, yearsOfService);
				
				// Determine salary raise for each employee
				if(employee.getSalary() <= 30000 && employee.getYearsOfService() <= 2) {
					newSalary = employee.processRaise(3.00);
					employee.setSalary(newSalary);
					
				} else if (employee.getSalary() <= 30000 && employee.getYearsOfService() >= 3) {
					newSalary = employee.processRaise(2.50);
					employee.setSalary(newSalary);
				} else if (employee.getSalary() >= 30000.01 && employee.getSalary() <= 60000 && employee.getYearsOfService() <= 5) {
					newSalary = employee.processRaise(2.25);
					employee.setSalary(newSalary);
				} else if (employee.getSalary() >= 30000.01 && employee.getSalary() <= 60000 && employee.getYearsOfService() >= 6) {
					newSalary = employee.processRaise(2.00);
					employee.setSalary(newSalary);
				} else if (employee.getSalary() >= 60000.01 && employee.getSalary() <= 80000 && employee.getYearsOfService() <= 5) {
					newSalary = employee.processRaise(1.75);
					employee.setSalary(newSalary);
				} else if (employee.getSalary() >= 60000.01 && employee.getSalary() <= 80000 && employee.getYearsOfService() >= 6) {
					newSalary = employee.processRaise(1.50);
					employee.setSalary(newSalary);
				} else if (employee.getSalary() >= 80000.01 && employee.getYearsOfService() <= 5) {
					newSalary = employee.processRaise(2.25);
					employee.setSalary(newSalary);
				} else {
					newSalary = employee.processRaise(1.00);
					employee.setSalary(newSalary);
				}
				
				//System.out.println(newSalary + "  " + salary + "  " + yearsOfService);
				// Write employee object to file
				output.writeObject(employee);
				//System.out.println(employee);
			}
			
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.blz;

public class EmployeePayrollMain {
	public static void main(String[] args) {
		EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
		System.out.println("Welcolme to employee payRoll");
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}
}

package com.blz;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeePayrollTest {

	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
		employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
		employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
		employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}
}

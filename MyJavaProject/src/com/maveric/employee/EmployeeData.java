package com.maveric.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	//
	public void pushToDataBase(Employee emp) {
		System.out.println("Employee moved to DB");
		System.out.println(emp.empNo);
		System.out.println(emp.empName);
		System.out.println(emp.salary);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData data = new EmployeeData();
		
		Employee emp1 = new Employee();
		//emp1.empNo=101;
		emp1.empName="AAA";
		emp1.salary = 15000;
		data.pushToDataBase(emp1);
  		
		Employee emp2 = new Employee();
		//emp2.empNo=102;
		emp2.empName="BBB";
		emp2.salary = 16000;
		data.pushToDataBase(emp2);

/*	Employee emp1 = new Employee(101);
		//emp1.empNo=101;
		emp1.empName="AAA";
		emp1.salary = 15000;
		data.pushToDataBase(emp1);
		
		Employee emp2 = new Employee(102);
		//emp2.empNo=102;
		emp2.empName="BBB";
		emp2.salary = 16000;
		data.pushToDataBase(emp2);*/

		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		
		
		
		for( Employee emp : empList)
		{
			System.out.println(emp);
		}
		
	}

}

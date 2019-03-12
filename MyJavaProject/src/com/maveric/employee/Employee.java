package com.maveric.employee;

public class Employee {
	//instance Variable
	public int empNo;
	public String empName;
	public double salary;
	public static int empCount = 101;
	
	
	//constructor(Parameter less)
//	public Employee() {
	//below is Local variable
	//	empNo=101;
	//}
	
	/*public Employee(int empNo) {
		//below is Local variable
			this.empNo=empNo;
			//this.empNo = current Instance Variable
		}*/
	public Employee() {
		empNo=empCount;
		empCount++;
	}
	
}

package com.maveric.nonstaticdemo;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaTest obj1=new AreaTest();
		int res = obj1.areaOfRectangle(10,20);
		System.out.println(res);
		System.out.println(obj1);
	}
	public int areaOfRectangle(int length, int width) {
		int area=length*width;
		return area;
		//length, width, and are are all the 3 called as local variable
	}
	//obj1 is called as reference variable

	//------------------------------------------
	//static variable or class variable
	//non static variable or instance variable
	
}

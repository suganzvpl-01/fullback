package com.maveric.methods;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = StaticMethod.areaOfRectangle(20,20);
		System.out.println(res);
	}
	public static int areaOfRectangle(int length, int width) {
		int area=length*width;
		return area;
	}
}


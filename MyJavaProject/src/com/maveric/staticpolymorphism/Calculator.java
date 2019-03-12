package com.maveric.staticpolymorphism;

public class Calculator {
	//no of parameter
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	//no of parameter
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	//different Datatype
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	//sequence of parameter
	public void add(double a, int b) {
		System.out.println(a+b);
	}
}

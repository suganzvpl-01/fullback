package com.maveric.nonstaticdemo;

public class VariableTest {
	//private variable can be used only in class
	//declared inside the class and this is static variable.
	public static int a = 10;
	//declared inside the class, this is non static variable.
	public int b = 20;
	
	public static void printStaticData() {
		System.out.println(VariableTest.a);
	}
	public void printNonStaticData() {
		System.out.println(VariableTest.a);
		System.out.println(b);
	}
	public void printLocationObject(VariableTest obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(VariableTest.a);
		// Variable below is overridden
		VariableTest.a=55;
		System.out.println(VariableTest.a);
		VariableTest obj1=new VariableTest();
		obj1.b=45;
		System.out.println(obj1.b);
		VariableTest obj2=new VariableTest();
		System.out.println(obj2.b);
		//Assigning in obj2
		obj1=obj2;
		//for null pointer exception
		//obj1=obj2=null;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		VariableTest obj3=new VariableTest();
		obj3.printNonStaticData();
		
		obj1.printLocationObject(obj1);
		obj1.printLocationObject(obj2);
	}

}

package com.maveric.collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//normal
		int x=10;
		int y = 20;
		System.out.println(x+y);
		
		//non generic type
		Object a = x; // boxing (just stores anyway)
		Object b = y;
		Object c=x=y;
		int d= (int) a; 
		System.out.println(c);
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("test");
		list.add(45);
		
		int size= list.size();
		System.out.println(size);
		
		String res = (String) list.get(1);
		System.out.println(res);
		
		//Generic Type
		
		
		
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("1");
		listOfNames.add("test");
		listOfNames.add("45");
		
		int sizeOfNames= list.size();
		System.out.println(sizeOfNames);
		
		String resOf = listOfNames.get(1);
		System.out.println(resOf);

		
		
		//Hashmap
		
		HashMap<Integer, String> listOfEmployee = new HashMap<Integer, String>();
		listOfEmployee.put(101, "john");
		listOfEmployee.put(102, "jsfgd");
		
		//clone
		Object aClone = listOfEmployee.clone();
		System.out.println(aClone);
		
		for (String names:listOfEmployee.values())
		{
			System.out.println(names);
			System.out.println(listOfEmployee.get(names));
			
		}
		
	}

}

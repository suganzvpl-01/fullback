package com.maveric.substring;

public class StringMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Environment Science";
		
		
		/*String subText=name.substring();
		System.out.println(subText);*/
		
		//$450,000
		String sal= "$450,000";
		sal=sal.substring(1);
		System.out.println(sal);
		sal = sal.replace("$", "");
		sal = sal.replace(",", "");
		System.out.println(sal);
		if(sal.equals("450000"))
		{
			System.out.println("Matching");
		}
		name = "Environmental Science";
		if(name.toLowerCase().contains("science"))
		{
			System.out.println("Mathcing - Science");
		}
		else {
			System.out.println("Not Matching");
		}
		name = "maveric\bala102";
		//String name1[] = name.split("/");
/*		for (String na : name1) {
			System.out.println(na);
		}*/
		System.out.println(name.split("/")[1]);
				
		
	}

}

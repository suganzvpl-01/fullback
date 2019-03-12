package com.maveric.assignments;

public class AnswerSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignments Answers");
		System.out.println("==============================================================");
		System.out.println();
		System.out.println("1. Create a program to display odd and even results from 0 to 30. Using For and while Loop");
		for(int i = 0;i<=30;i++) {
			
			if(i%2 == 0) {
				System.out.println("Value "+ i + " is Even");
			}
			else {
				System.out.println("Value "+ i + " is Odd");
			}
			
		}
	}

}

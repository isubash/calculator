package com.calculator.java;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First No: ");
		int no1 = sc.nextInt();
		
		System.out.print("Enter the Second No: ");
		int no2 = sc.nextInt();
		
		System.out.print("Enter the required Operations['+, -, *, /']");
		char operator = sc.next().charAt(0);
		
		int res = calculate(no1, no2, operator);
		System.out.println(no1+ " "+ operator + " "+ no2 + " " + " = " + res);

	}
	static int calculate(int x, int y, char opertor) {
		int res = 0;
		switch(opertor)
		{
		 case '+':
			res = x + y;
			break;
		 case '-':
			 res = x - y;
			 break;
		 case '*':
			 res = x * y;
			 break;
		 case '/':
			 res = x / y;
			 break;	
		}
		return res;
		
	}

}

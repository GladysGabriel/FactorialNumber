package com.fact;

public class FactorialNumber {

	public static void main(String[] args) {
		
	int i,fact=1;
	int number = 5;
	for(i=1;i<=number;i++) {
		fact=fact*i;
	}
   System.out.println("Factorial of the num is: " + fact);
	}

}
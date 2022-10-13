package com.yash.assignment.junitprogram;

public class Program2 {

	static int factorial(int number) {
		int i, fact = 1;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}

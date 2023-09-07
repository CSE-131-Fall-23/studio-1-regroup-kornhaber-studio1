package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first integer to be averaged: ");
		int i0 = in.nextInt();
		System.out.print("Enter the second integer to be averaged: ");
		int i1 = in.nextInt();
		
		Double avg = (double)(i0 + i1)/2;
		System.out.print("The average of " + i0 + " and " + i1 + " is " + avg);
	}

}

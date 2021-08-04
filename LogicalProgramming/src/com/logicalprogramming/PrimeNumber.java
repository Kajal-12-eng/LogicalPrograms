package com.logicalprogramming;
import java.util.Scanner;

public class PrimeNumber {
	
		public static void main (String[] args) {
		int i,m=0,flag=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter value to calculate prime number:: ");
		int number = scanner.nextInt();
		m=(int) (number/2);
		if (number==0 || number==1) {
		System.out.println("Not a prime number::" +number);
		}
		else {
		for (i=2; i<number; i++) {
			if(number%i==0) {
				System.out.println("Not a prime number::" +number);
				flag=1;
			}
		}
	    if(flag==0)
	    {
	    	System.out.println("Is a prime number:: " +number);
	    }
	  }
	}
 }
  

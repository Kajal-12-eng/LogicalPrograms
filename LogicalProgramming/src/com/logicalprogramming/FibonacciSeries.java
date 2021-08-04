package com.logicalprogramming;
import java.util.Scanner;

 public class FibonacciSeries {
 public static void main (String[] args) {
	 int perviousNumber=0;
	 int nextNumber=1;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter value to calculate series:: ");
	 double maxNumber = scanner.nextInt();
	 for (int i=1; i<=maxNumber; i++) {
   	 System.out.println("number:: " +perviousNumber);
    	int sum = perviousNumber+nextNumber;
		perviousNumber=nextNumber;
		nextNumber=sum;
		}
	}
}

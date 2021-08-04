package com.logicalprogramming;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) { 
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the  number to calculate perfect number::");
		n = s.nextInt();
		for(int i = 1; i < n/2; i++)
		{
		if(n % i == 0)
		{
		sum += i;
		}
		  i++;
		}
		if(sum == n)
		System.out.println("The number is Perfect");
		else
		System.out.println("The number is not Perfect"); 
	}
}

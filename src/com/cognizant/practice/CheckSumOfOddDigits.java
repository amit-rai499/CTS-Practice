//1.Check Sum of Odd Digits
//Write a program to read a number , calculate the sum of odd digits (values) present in the given number.
//
//Include a class UserMainCode with a static method checkSum which accepts a positive integer . The return type should be 1 if the sum is odd . In case the sum is even return -1 as output.
//
//Create a class Main which would get the input as a positive integer and call the static method checkSum present in the UserMainCode.
//
//Input and Output Format: 
//Input consists of a positive integer n.
//Refer sample output for formatting specifications.
//
//
//Sample Input 1:
//56895
//Sample Output 1:
//Sum of odd digits is odd.
// 
//Sample Input 2:
//84228
//Sample Output 2:
//Sum of odd digits is even.

package com.cognizant.practice;

import java.util.Scanner;

public class CheckSumOfOddDigits {
	static int checkSum(int n) {
		int sum=0;
		int c=0;
		while (n>0) {
			int rem=n%10;
			if(c%2!=0)
				sum+=rem;
			c++;
			n/=10;
		}
		if(sum%2==0)
			return -1;
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(checkSum(n)==-1)
			System.out.println("Sum of odd digits is even.");
		else {
			System.out.println("Sumo of odd digits is odd.");
		}
	}

}

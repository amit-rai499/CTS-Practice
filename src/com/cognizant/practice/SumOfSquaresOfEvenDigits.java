//3.Sum of Squares of Even Digits
// 
//Write a program to read a number , calculate the sum of squares of even digits (values) present in the given number.
// 
//Include a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer . The return type (integer) should be the sum of squares of the even digits.
// 
//Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of a positive integer n.
//Output is a single integer .
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//56895
//Sample Output 1:
//100

package com.cognizant.practice;

import java.util.Scanner;

public class SumOfSquaresOfEvenDigits {
	static int sumOfSquaresOfEvenDigits(int n) {
		int sum=0;
		while (n>0) {
			int rem=n%10;
			if(rem%2==0)
				sum+=(rem*rem);
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scanner.nextInt();
		System.out.println(sumOfSquaresOfEvenDigits(n));
	}

}

//Even and Odd Index Sum
// 
//Write a program that accepts a positive number as input and calculates the sum of digits at even indexes (say evenSum) and sum of digits at odd indexes (say oddSum) in the given number. If both the sums are equal , print 'yes', else print no.
// 
//Example:
//input = 23050
//evenSum = 2 + 0 + 0 = 2
//oddSum = 3 + 5 = 8
//output = no
// 
//Include a class UserMainCode with a static method “sumOfOddEvenPositioned” that accepts an integer and returns an integer. The method returns 1 if the 2 sums are equal. Else the method returns -1.
// 
//Create a class Main which would get an integer as input and call the static method sumOfOddEvenPositioned present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of an integer.
//Output consists of a string that is either “yes” or “no”.
// 
//Sample Input 1:
//23050
// 
//Sample Output 1:
//no
// 
//Sample Input 2:
//231
// 
//Sample Output 2:
//yes

package com.cognizant.practice;

import java.util.Scanner;

public class EvenAndOdd {
	public static int sumofOddEvenPosition(String num)
	{
		int c1=0;
		int c2=0;
		for(int i=0;i<num.length();i++)
		{
			if(i%2==0)
				c1=c1+Integer.parseInt(String.valueOf(num.charAt(i)));
			else
				c2=c2+Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		if(c1==c2)
			return 1;
		else
			return -1;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.next();
		int res=EvenAndOdd.sumofOddEvenPosition(num);
		if(res==1)
			System.out.println("yes");
		else
			System.out.print("no");
	}
	}

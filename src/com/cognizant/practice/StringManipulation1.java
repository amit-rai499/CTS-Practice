//16. Simple String Manipulation - II
// 
//Write a program to read a string and return an integer based on the following rules.
//If the first word and the last word in the String match, then return the number of characters in the word else return sum of the characters in both words. Assume the Strings to be case - sensitive.
//Include a class UserMainCode with a static method calculateWordSum which accepts a string. The return type (integer) should be based on the above rules.
//Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string with maximum size of 100 characters.
//Output consists of a string.
//Refer sample output for formatting specifications.
//Sample Input 1:
//COGNIZANT TECHNOLOGY SOLUTIONS COGNIZANT
//Sample Output 1:
//9
//Sample Input 2:
//HOW ARE YOU
//Sample Output 2:
//6

package com.cognizant.practice;
import java.util.Scanner;

public class StringManipulation1 {
	public static int calculateWordSum(String input)
	{
		String[] ar=input.split(" ");
		if(ar[0].equals(ar[ar.length-1]))
		{
			return ar[0].length();
		}
		else
		{
			return ar[0].length()+ar[ar.length-1].length();
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.print(StringManipulation1.calculateWordSum(input));
	}

}


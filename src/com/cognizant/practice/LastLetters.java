//8.	Last Letters
//Write a program to read a sentence as a string and store only the last letter of each word of the sentence in capital letters separated by $. Print the final string.
// 
//Include a class UserMainCode with a static method getLastLetter which accepts a string. The return type (string) should return the final string.
//Create a Class Main which would be used to read a string, and call the static method present in UserMainCode.
// 
//Input and Output Format:
//Input consists of a string.
//Output consists of a string (the final string).
//Refer sample output for formatting specifications.
// 
//Smaple Input :
//This is a cat
//Sample Output :
//S$S$A$T


package com.cognizant.practice;
import java.util.*;
public class LastLetters {
	
	static String lastLetters(String s) {
		String arr[]=s.split(" ");
		String res="";
		int i;
		for (i=0;i<arr.length-1;i++)
		{
			res+=arr[i].charAt(arr[i].length()-1)+"$";
		}
		res+=arr[i].charAt(arr[i].length()-1);
		return res.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		System.out.println(lastLetters(s));
	}

}

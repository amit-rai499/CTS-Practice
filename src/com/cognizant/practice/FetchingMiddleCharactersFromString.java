//4.Fetching Middle Characters from String
// 
//Write a program to read a string of even length and to fetch two middle most characters from the input string and return it as string output.
// 
//Include a class UserMainCode with a static method getMiddleChars which accepts a string of even length as input . The return type is a string which should be the middle characters of the string.
// 
//Create a class Main which would get the input as a string and call the static method getMiddleChars present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of a string of even length.
//Output is a string .
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//this
//Sample Output 1:
//hi
// 
//Sample Input 1:
//Hell
//Sample Output 1:
//el

package com.cognizant.practice;

import java.util.Scanner;

public class FetchingMiddleCharactersFromString {

	static String getMiddleChars(String s) {
		int mid=s.length()/2;
		String reString= Character.toString(s.charAt(mid-1))+Character.toString(s.charAt(mid));
		return reString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string of even number of characters:");
		String string=scanner.nextLine();
		System.out.println(getMiddleChars(string));
	}

}

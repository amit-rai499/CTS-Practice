//2.Number Validation
//Write a program to read a string of 10 digit number , check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.
// 
//Include a class UserMainCode with a static method validateNumber which accepts a string as input .
//The return type of the output should be 1 if the string meets the above specified format . In case the number does not meet the specified format then return -1 as output.
// 
//Create a class Main which would get the input as a String of numbers and call the static method validateNumberpresent in the UserMainCode.
// 
//Input and Output Format:
//Input consists of a string.
//Output is a string specifying the given string is valid or not .
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//123-456-7895
//Sample Output 1:
//Valid number format
//
//Sample Input 2:
//-123-12344322
//Sample Output 2:
//Invalid number format

package com.cognizant.practice;

import java.util.Scanner;

public class NumberValidation {

	static int validateNumber(String s) {
		if(s.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
			return 1;
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String string=scanner.nextLine();
		if(validateNumber(string)==1)
			System.out.println("Valid");
		else {
			System.out.println("Invalid");
		}

	}

}

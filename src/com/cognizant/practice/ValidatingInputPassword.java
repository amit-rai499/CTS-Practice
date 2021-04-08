//27.Validating Input Password
//102.Write a code get a password as string input and validate using the rules specified below. Apply following validations:
// 
//1. Minimum length should be 8 characters
//2. Must contain any one of these three special characters @ or _ or #
//3. May contain numbers or alphabets.
//4. Should not start with special character or number
//5. Should not end with special character
// 
//Include a class UserMainCode with a static method validatePassword which accepts password string as input and returns an integer. The method returns 1 if the password is valid. Else it returns -1.
// 
// 
//Create a class Main which would get the input and call the static method validatePassword present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of a string.
//Output is a string Valid or Invalid.
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//ashok_23
//Sample Output 1:
//Valid
//
//Sample Input 2:
//1980_200
//Sample Output 2:
//Invalid

package com.cognizant.practice;

import java.util.Scanner;

public class ValidatingInputPassword {

	static int validatePassword(String input) {
		if(input.length()<8)
			return -1;
		if(!input.contains("@") && !input.contains("_") && !input.contains("#"))
			return -1;
		if(input.charAt(0)=='@' || input.charAt(0)=='_' || input.charAt(0)=='#')
			return -1;
		int l=input.length();
		if(input.charAt(l-1)=='@' || input.charAt(l-1)=='_' || input.charAt(l-1)=='#')
			return -1;
		if(Character.isDigit(input.charAt(0)))
			return -1;
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int res=validatePassword(scanner.next());
		if(res==1)
			System.out.println("Valid");
		else {
			System.out.println("Invalid");
		}

	}

}

//1.	PAN Card
//Write a program to read a string and validate PAN no. against following rules:
//1. There must be eight characters.
//2. First three letters must be alphabets followed by four digit number and ends with alphabet
//3. All alphabets should be in capital case.
// 
//Print “Valid” if the PAN no. is valid, else print “Invalid”.
// 
//Include a class UserMainCode with a static method validatePAN which accepts a string. The return type (Integer) should return 1 if the string is a valid PAN no. else return 2.
//Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string, which corresponds to the PAN number.
//Output consists of a string - "Valid" or "Invalid"
//Refer sample output for formatting specifications.
//Sample Input 1:
//ALD3245E
//Sample Output 1:
//Valid
//Sample Input 2:
//OLE124F
//Sample Output 2:
//Invalid
//


package com.cognizant.practice;

import java.util.Scanner;

public class PanCard {
	
	static int validatePan(String pan) {
		if (pan.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
		return 1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pan no:");
		String pan=sc.nextLine();
		if(validatePan(pan)==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		

	}

}

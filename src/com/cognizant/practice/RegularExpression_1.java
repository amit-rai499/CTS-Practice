//36. Regular Expression - 1
//
//Given a string (s) apply the following rules.
//
//1. String should be only four characters long.
//2. First character can be an alphabet or digit.
//3. Second character must be uppercase 'R'.
//4. Third character must be a number between 0-9.
//
//If all the conditions are satisifed then print TRUE else print FALSE.
//
//Include a class UserMainCode with a static method validate which accepts the string. The return type is the boolean formed based on rules.
//
//Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.
//
//Input and Output Format:
//
//Input consists of a string.
//
//Output consists of TRUE or FALSE .
//
//Refer sample output for formatting specifications.
//
//Sample Input 1:
//vR4u
//
//Sample Output 1:
//TRUE
//
//Sample Input 2:
//vRau
//
//Sample Output 2:
//FALSE
//
//Sample Input 3:
//vrau
//
//Sample Output 3:
//FALSE

package com.cognizant.practice;

import java.util.*;
public class RegularExpression_1 {

	public static boolean Validate(String input)
	{
		if(input.matches("[a-zA-Z]{1}[R]{1}[0-9]{1}."))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean res=RegularExpression_1.Validate(input);
		if(res)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

	}
}

//37. Regular Expression – 2 (Age Validator)
//
//Given the age of a person as string, validate the age based on the following rules.
//
//1. Value should contain only numbers.
//2. Value should be non-negative.
//3. Value should be in the range of 21 to 45'.
//
//If all the conditions are satisifed then print TRUE else print FALSE.
//
//Include a class UserMainCode with a static method ValidateAge which accepts the string. The return type is the boolean formed based on rules.
//
//Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.
//
//Input and Output Format:
//
//Input consists of a string.
//Output consists of TRUE or FALSE .
//Refer sample output for formatting specifications.
//
//Sample Input 1:
//23
//
//Sample Output 1:
//TRUE
//
//Sample Input 2:
//-34
//
//Sample Output 2:
//FALSE
//
//Sample Input 3:
//3a
//
//Sample Output 3:
//FALSE

package com.cognizant.practice;

import java.util.Scanner;

public class RegularExpression2 {
	public static boolean ValidAge(String num)
	{
		if(num.matches("[21-45]{2}"))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String age=s.next();
		System.out.println(ValidAge(age));
	}
}

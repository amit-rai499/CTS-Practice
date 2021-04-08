//28.ID Validation
//Write a program to get two string inputs and validate the ID as per the specified format.
// 
//Include a class UserMainCode with a static method validateIDLocations which accepts two strings as input.
// 
//The return type of the output is a string Valid Id or Invalid Id.
// 
//Create a class Main which would get the input and call the static method validateIDLocations present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of two strings.
//First string is ID and second string is location. ID is in the format CTS-LLL-XXXX where LLL is the first three letters of given location and XXXX is a four digit number.
// 
//Output is a string Valid id or Invalid id.
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//CTS-hyd-1234
//hyderabad
//Sample Output 1:
//Valid id
//
//Sample Input 2:
//CTS-hyd-123
//hyderabad
//Sample Output 2:
//Invalid id

package com.cognizant.practice;

import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;

public class IDvalidation {
	static String validateIDLocations(String id,String city) {
		if(id.matches("CTS[-]{1}[a-z]{3}[-]{1}[0-9]{4}") && (id.substring(4,7).equals(city.substring(0,3))))
				return "Valid id";
		else {
			return "Invalid id";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println(validateIDLocations(scanner.next(), scanner.next()));

	}

}

//30.Find the difference between Dates in months
//Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the difference between two dates in months.
// 
//Include a class UserMainCode with a static method getMonthDifference which accepts two date strings as input.
// 
//The return type of the output is an integer which returns the diffenece between two dates in months.
// 
//Create a class Main which would get the input and call the static method getMonthDifference present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of two date strings.
//Format of date : yyyy-mm-dd.
// 
//Output is an integer.
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//2012-03-01
//2012-04-16
//Sample Output 1:
//1
//
// 
//Sample Input 2:
//2011-03-01
//2012-04-16
//Sample Output 2:
//13

package com.cognizant.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DifferenceBetweenDates {
	
	static int getMonthDifference(String date1,String date2) {
		long daysBetween = ChronoUnit.MONTHS.between(LocalDate.parse(date1),
			    LocalDate.parse(date2));
		return (int) daysBetween;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println(getMonthDifference(scanner.next(), scanner.next()));
	}

}

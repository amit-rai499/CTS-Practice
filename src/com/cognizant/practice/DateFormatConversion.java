//21. Date Format Conversion
// 
//Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy.
// 
//Include a class UserMainCode with a static method “convertDateFormat” that accepts a String and returns a String.
// 
//Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode.
// 
//Input and Output Format:
//Input consists of a String.
//Output consists of a String.
// 
//Sample Input:
//12/11/1998
// 
//Sample Output:
//12-11-98

package com.cognizant.practice;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateFormatConversion {
	static String convertDateFormat(String d) throws Exception{
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		return formatter.format(date1);
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format :");
		String str=scanner.next();
		System.out.println(convertDateFormat(str));

	}

}

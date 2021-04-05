//13. Day of the Week
// 
//Write a program to read a date as string (MM-dd-yyyy) and return the day of week on that date.
//Include a class UserMainCode with a static method getDay which accepts the string. The return type (string) should be the day of the week.
//Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string.
//Output consists of a string.
//Refer sample output for formatting specifications.
//Sample Input 1:
//07-13-2012
//Sample Output 1:
//Friday

package com.cognizant.practice; 
import java.text.SimpleDateFormat;
import java.util.*;
public class DayOfTheWeek {
	static String getDay(String date) throws Exception
	{
	    Date date1=new SimpleDateFormat("MM-dd-yyyy").parse(date);
	    String dayWeekText = new SimpleDateFormat("EEEE").format(date1);
	    return dayWeekText;
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd-MM-yyyy format :");
		String s=sc.nextLine();
		System.out.println(getDay(s));
	}

}

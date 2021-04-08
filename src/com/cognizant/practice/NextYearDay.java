package com.cognizant.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NextYearDay {
	static String nextYearDay(String d) throws Exception {
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
		Calendar c = Calendar.getInstance();
        c.setTime(date1);
        c.add(Calendar.YEAR, 1);
        Date currentDatePlusOne = c.getTime();
        String dayWeekText = new SimpleDateFormat("EEEE").format(currentDatePlusOne);
        return dayWeekText;
	}
	public static void main(String[] args) throws Exception{
		Scanner scanner=new Scanner(System.in);
		System.out.println(nextYearDay(scanner.next()));
	}
}

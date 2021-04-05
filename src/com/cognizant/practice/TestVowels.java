//1.	Test Vowels
//Write a program to read a string and check if given string contains exactly five vowels in any order. Print “Yes” if the condition satisfies, else print “No”.
//Assume there is no repetition of any vowel in the given string and all characters are lowercase.
//Include a class UserMainCode with a static method testVowels which accepts a string. The return type (Integer) should return 1 if all vowels are present, else return 2.
//Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
// 
//Input and Output Format:
//Input consists of a string.
//Output consists of a string (“Yes” or “No”).
//Refer sample output for formatting specifications.
//Sample Input 1:
//acbisouzze
//Sample Output 1:
//Yes
// 
//Sample Input 2:
//cbisouzze
//Sample Output 2:
//No

package com.cognizant.practice;
import java.util.*;

public class TestVowels {
	public static int testVowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;
		}
		if(count==5)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		if(testVowels(s)==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

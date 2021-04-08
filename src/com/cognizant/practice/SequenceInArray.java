//43. Sequence in Array
//
//Write a program to accept an int array as input, and check if [1,2,3] appears somewhere in the same sequence.
//
//Include a class UserMainCode with a static method searchSequence which accepts the int array. The return type is a boolean which returns true or false.
//
//Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.
//
//Input and Output Format:
//
//Input consists of a an integer which denotes the size of the array followed by the array of integers.
//Output should print true or false.
//Refer sample output for formatting specifications.
//
//Sample Input 1:
//9
//11
//-2
//5
//1
//2
//3
//4
//5
//6
//
//Sample Output 1:
//TRUE
//
//Sample Input 2:
//6
//-2
//5
//1
//3
//2
//6
//
//Sample Output 2:
//FALSE

package com.cognizant.practice;

import java.util.Scanner;

public class SequenceInArray {
	public static boolean searchSequence(int[] arr)
	{
		int[] a= {1,2,3};
		if(arr.length<3)
			return false;
		for(int i=0;i<(arr.length)-3;i++)
		{
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println(searchSequence(arr));
	}

}

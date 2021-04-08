//15.Difference between largest and smallest elements in an array
//Given a method taking an int array having size more than or equal to 1 as input. Write code to return the difference between the largest and smallest elements in the array. If there is only one element in the array return the same element as output.
// 
//Include a class UserMainCode with a static method getBigDiff which accepts a integer array as input.
// 
//The return type of the output is an integer which is the difference between the largest and smallest elements in the array.
// 
//Create a Main class which gets integer array as an input and call the static method getBigDiff present in theUserMainCode.
// 
//Input and Output Format:
//Input is an integer array.First element in the input represents the number of elements in an array.
//Size of the array must be >=1
//Output is an integer which is the difference between the largest and smallest element in an array.
//Sample Input 1:
//4
//3
//6
//2
//1
// 
//Sample Output 1:
//5
// 
//Sample Input 2:
//4
//5
//3
//7
//2
// 
//Sample Output 2:
//5

package com.cognizant.practice;

import java.util.Scanner;

public class LargestSmallestDifference {
	
static int getBigDiff(int arr[])
{
	if(arr.length==1)
		return arr[0];
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
	return max-min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		System.out.println(getBigDiff(arr));

	}

}

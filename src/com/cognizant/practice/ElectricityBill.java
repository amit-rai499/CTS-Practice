//18.Calculate Electricity Bill
// 
//Given a method calculateElectricityBill() with three inputs. Write code to calculate the current bill.
// 
//Include a class UserMainCode with a static method calculateElectricityBill which accepts 3 inputs .The return type of the output should be an integer .
// 
//Create a class Main which would get the inputs and call the static method calculateElectricityBill present in the UserMainCode.
// 
//Input and Output Format:
//Input consist of 3 integers.
//First input is previous reading, second input is current reading and last input is per unit charge.
//Reading Format - XXXXXAAAAA where XXXXX is consumer number and AAAAA is meter reading.
//Output is a single integer corresponding to the current bill.
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//ABC2012345
//ABC2012660
//4
//Sample Output 1:
//1260
// 
//Sample Input 2:
//ABCDE11111
//ABCDE11222
//3
//Sample Output 2:
//333

package com.cognizant.practice;

import java.util.Scanner;

public class ElectricityBill {
	
	static int calculateElectricityBill(String curr,String prev,int charge)
	{
		int current=Integer.parseInt(curr.substring(5));
		int previous=Integer.parseInt(prev.substring(5));
		return (current-previous)*charge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String prevString=scanner.next();
		String currString=scanner.next();
		int charge=scanner.nextInt();
		System.out.println(calculateElectricityBill(currString, prevString, charge));
	}

}

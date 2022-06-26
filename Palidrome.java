package week2.day1;

import java.util.Arrays;

public class Palidrome {

	public static void main(String[] args) {
		String s="racecar";//initialize string s
		char[] stringArray=s.toCharArray();//change from string to array 
		int count=0;
		
		
		char revarray[] =new char[stringArray.length];//empty array to store reverse array
	
		for(int i = stringArray.length-1;i>=0;i--) {
	      revarray[count]=stringArray[i];
		count++;
	}
		if (Arrays.equals(stringArray,revarray)){
			System.out.println("The string "+s+ " is a palindrome");
		}
		else 
			System.out.println("The string"+s+" is not a palindrome");
	}
	}
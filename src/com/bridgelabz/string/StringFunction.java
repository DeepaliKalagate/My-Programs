package com.bridgelabz.string;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringFunction {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string : ");
		str1=scanner.nextLine();
		String str3 = str1;
		System.out.println("Enter second String : ");
		str2 = scanner.nextLine();
		char[] a= str1.toCharArray();
		char[] b= str2.toCharArray();
		
		 if (utility.areAnagram(a, b)) 
		 {
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
		 }
	        else
	        {
	            System.out.println("The two strings are not"
	                               + " anagram of each other");
	        }
		if(utility.Palindrome(str3))
		{
			
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
		
	
		 scanner.close();

	}

}

package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utility 
{

	public static boolean areAnagram(char[] str1, char[] str2) 
    { 
       
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    }
	public static boolean Palindrome(String str1)
	{
		String rev="";
		int n1=str1.length()-1;
		for(int i=n1;i>=0;i--)
		
			rev = rev + str1.charAt(i);
			if(str1.equals(rev))
				return true;
			else
				return false;
}
	
	static List<String> listRecursive = new ArrayList<String>();

	public static void permute(String str, int low, int high) 
	{
		if (low == high)
		{
			System.out.println(str);
			listRecursive.add(str);
		} 
		else
		{
			for (int i = low; i <= high; i++) 
			{
				str = swap(str, low, i);
				// System.out.println("x="+str);
				permute(str, low + 1, high);
				str = swap(str, low, i);
				// System.out.println("y="+str);
			}
		}
	}

//method to swap string
	/**
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String a, int i, int j) 
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void swap1(char[] a, int i, int j) 
	{
		char ch = a[i];
		a[i] = a[j];
		a[j] = ch;
	}

	static List<String> listIterative = new ArrayList<String>();

	public static void permutations(String s) 
	{
		// convert string to a character array (Since String is immutable)
		char[] chars = s.toCharArray();
		int[] p = new int[s.length()];
		int i = 1, j = 0;

		System.out.print(s);
		listIterative.add(s);
		while (i < s.length()) 
		{
			if (p[i] < i) 
			{
		
				j = (i % 2) * p[i];
				swap1(chars, i, j);
				System.out.print(" " + String.valueOf(chars));
				listIterative.add(String.valueOf(chars));
				p[i]++; 
				i = 1; 
			}
			
			else 
			{				
				p[i] = 0;
				i++;
			}
		}
	}

	public static void compareList()
	{
		Collections.sort(listIterative);
		Collections.sort(listRecursive);
		if((listIterative).equals(listRecursive)){
			System.out.println("lists are equal");
		}
		else
		{
		System.out.println("the lists are not equal");	
		}
	}

	public Object StdRandom;
	
	
	
	public boolean LeapYearValidation(int year) 
	{
		if (year >= 1582 && year <= 9999)
			return true;
		return false;

	}
	public boolean leapYear(int year) 
	{

		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}

	}
	public static int calculateDayOfWeek(int day, int month, int year)
	{
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	public static int daysOfMonth(int month, boolean leapYear)
	{

		switch (month)
		{
		case 1:
			return 31;
		case 2:
			if (leapYear)
				return 29;
			else
				return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		}
		return 0;

	}
	public boolean checkValidationForDate(int month, int day, boolean leapYear) 
	{
		switch (month) 
		{
		case 1:
			if (day > 0 && day <= 31) 
			{
				return true;
			} else 
			{
				return false;
			}
		case 2:
			if (leapYear) 
			{
				if (day > 0 && day <= 29) 
				{
					return true;
				} 
				else 
				{
					return false;
				}

			} 
			else 
			{
				if (day > 0 && day <= 28) 
				{
					return true;
				} 
				else 
				{
					return false;
				}
			}

		case 3:
			if (day > 0 && day <= 31) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		case 4:
			if (day > 0 && day <= 30)
			{
				return true;
			}
			else 
			{
				return false;
			}
		case 5:
			if (day > 0 && day <= 31)
			{
				return true;
			}
			else 
			{
				return false;
			}
		case 6:
			if (day > 0 && day <= 30)
			{
				return true;
			}
			else 
			{
				return false;
			}
		case 7:
			if (day > 0 && day <= 31) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		case 8:
			if (day > 0 && day <= 31)
			{
				return true;
			} 
			else 
			{
				return false;
			}
		case 9:
			if (day > 0 && day <= 30) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		case 10:
			if (day > 0 && day <= 31) 
			{
				return true;
			}
			else
			{
				return false;
			}
		case 11:
			if (day > 0 && day <= 30) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		case 12:
			if (day > 0 && day <= 31)
			{
				return true;
			} 
			else
			{
				return false;
			}
		default:
			System.out.println("Please enter valid input");
		}
		return false;

	}
	
	
}


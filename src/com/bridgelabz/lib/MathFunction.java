package com.bridgelabz.lib;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.utilityMath;

public class MathFunction 
{

	public static void main(String[] args) 
	{
		utilityMath utility=new utilityMath();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \n1.Basic Maths\n" + "2.sqrt using newtons method\n" + "3.prime number\n"
				+ "4.factorial number\n" + "5.calculate future value\n" + "6.calculate present value\n"
				+ "7.max value\n" + "8.min value\n" + "9.collinear slope and area");
		int choice;
		choice = scanner.nextInt();
		switch (choice) 
		{
		case 1:
			System.out.println("Enter\na.harmonic number\n" + "b.sin of angle\n" + "c.cosine of angle\n" + "d.binary number");
			char option;
			option = scanner.next().charAt(0);
			switch (option)
			{
			case 'a':
				System.out.println("Enter number for harmonic number");
				int number = scanner.nextInt();
				utilityMath.PrintHarmonic(number);
				break;
			case 'b':
				System.out.println("Enter angle to find sin");
				int angle = scanner.nextInt();
				double radian = utilityMath.findRadiun(angle);
				double sin = utilityMath.findSin(radian);
				System.out.println("Sin(" + angle + ") = " + sin);
				break;
			case 'c':
				System.out.println("Enter angle to find cosine");
				int angle2 = scanner.nextInt();
				double radian2 = utilityMath.findRadiun(angle2);
				double cos = utilityMath.findSin(radian2);
				System.out.println("Cos(" + angle2 + ") = " + cos);
				break;
			case 'd':
				int decimalNumber;
				System.out.println("Enter a number");
				decimalNumber = scanner.nextInt();
				System.out.println("Binary is: " + utilityMath.findBinary(decimalNumber));
				break;
			}
			break;
		case 2:
			System.out.println("Enter number to find sqrt using newtons method");
			int c = scanner.nextInt();
			double epsilon = 1e-15;
			System.out.println(utilityMath.findSquareRootUsingNewtonsMethod(c, epsilon));
			break;
		case 3:
			System.out.println("Enter number to find prime number");
			int number2 = scanner.nextInt();
			
			if(utilityMath.isPrime(number2)) 
			{
				System.out.println("Prime number");
			}
			else 
			{
				System.out.println("Not Prime");
			}
			break;
		case 4:
			System.out.println("Enter number to find factorial");
			int number3 = scanner.nextInt();			
			System.out.println(utilityMath.CalculateFactorial(number3));
			break;
		case 5:
			System.out.println("Enter Amount : ");
			double investment=scanner.nextInt();
			System.out.println("Enter rate : ");
			double rate=scanner.nextFloat();
			System.out.println("Enter Years : ");
			int years=scanner.nextInt();
			
			rate =rate* 0.01;
			System.out.println("Years and FutureValues");
			
			for(int i = 1; i <= years; i++) 
			{
		    	int formatter = 19;
			    if (i >= 10) 
			    	formatter = 18;
			    System.out.println(i);
			   System.out.println(utilityMath.futureInvestmentValue(investment,rate/12,i));
			}
			break;
		case 6:
			System.out.println("Enter Amount : ");
			double investmentAmt=scanner.nextInt();
			System.out.println("Enter rate : ");
			double rateOfInt=scanner.nextFloat();
			System.out.println("Enter Years : ");
			int year=scanner.nextInt();
			
			rate =rateOfInt * 0.01;
			System.out.println("Years and PresentValues");
			
			for(int i = 1; i <= year; i++) 
			{
		    	int formatter = 19;
			    if (i >= 10) 
			    	formatter = 18;
			    System.out.println(i);
			   System.out.println(utilityMath.presentInvestmentValue(investmentAmt,rate/12,i));
			}
			break;
		case 7:
			System.out.println("Enter Elements in array :");
			int n=scanner.nextInt();
			int[] a=new int[n];
			System.out.println("Enter all the Elements for array:");
			for(int i=0;i<n;i++)
			{
				a[i]=scanner.nextInt();
			}
			int result=utilityMath.getMax(a);
			System.out.println("Max value is : "+result);
			break;
			
		case 8:
			System.out.println("Enter Elements in array :");
			int num=scanner.nextInt();
			int[] arr=new int[num];
			System.out.println("Enter all the Elements for array:");
			for(int i=0;i<num;i++)
			{
				arr[i]=scanner.nextInt();
			}
			int result1=utilityMath.getMin(arr);
			System.out.println("Min value is : "+result1);
			break;
			
		case 9:
			System.out.println("Enter number for A");
			int x1=scanner.nextInt();
			int y1=scanner.nextInt();
			System.out.println("Enter number for B: ");
			int x2=scanner.nextInt();
			int y2=scanner.nextInt();
			System.out.println("Enetr number for c: ");
			int x3=scanner.nextInt();
			int y3=scanner.nextInt();
			int ab=(y2-y1)/(x2-x1);
			int bc=(y3-y2)/(x3-x2);
			int ac=(y3-y1)/(x3-x1);
			if(ab==bc)
			{
				if(bc==ac)
				{
					System.out.println("Colinear");
				}
				else
				{
					System.out.println("Not Colinear");
				}
			}
			else
			{
				System.out.println("Not Colinear");
			}
			break;
		
		}
		scanner.close();
	}	
}

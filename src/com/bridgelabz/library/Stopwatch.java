package com.bridgelabz.library;

import java.util.Scanner;

import com.bridgelabz.utility.utilityMath;

public class Stopwatch
{
	static double start = 0, stop = 0;
	static void startTime() 
	{
			start = System.currentTimeMillis();
			System.out.println("started at " + start);
		}
	static void stopTime() 
	{
			stop = System.currentTimeMillis();
			System.out.println("stopped at " + stop);
		}
	static void elapsedTime() 
	{
			System.out.println("elapsed time is " + (stop - start) / 1000);
		}

		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter 1 to start");
			s.next();
			startTime();
			System.out.println("Enter to stop");
			s.next();
			stopTime();
			elapsedTime();
		
	}

}

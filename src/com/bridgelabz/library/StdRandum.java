package com.bridgelabz.library;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.utilityMath;

public class StdRandum 
{
	private static Random random;    
    private static long seed;        

    static 
    {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

	
	
	

	public static void main(String[] args)
	{
		utilityMath utility=new utilityMath();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \n1.Seed\n" + "2.Uniform\n" + "3.Double uniform\n"
				+ "4.Bernoulli \n" + "5.Gaussian\n" + "6.Gaussian With Parameters\n"
				+ "7.Discrete\n" + "8.Shuffle");
		int choice;
		choice = scanner.nextInt();
		switch (choice) 
		{
			case 1:
			
		}
		
	    
	}
}



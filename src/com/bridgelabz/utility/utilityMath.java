 package com.bridgelabz.utility;

public class utilityMath 
{
	public static void PrintHarmonic(int number) 
	{
		System.out.print("H=");
		for (int i = 1; i <= number; i++) 
		{
			if (i != number) 
			{
				System.out.print("1/" + i);
				System.out.print(" + ");
			} 
			else 
			{
				System.out.print("1/" + i);
			}
		}
	}
	
	public static double findRadiun(int degree)
	{
		return Math.toRadians(degree);
	}

	
	public static double findSin(double radiun)
	{
		return Math.sin(radiun);
	}

	
	public static double findCos(double radiun)
	{
		return Math.cos(radiun);
	}
	
	
	public static String findBinary(int decimalNumber) 
	{
		int  mod;
		
		String x = "";
		if (decimalNumber > 255) 
		{
			System.out.println("Enter Number between 1 to 255");
		} 
		else 
		{
			while (decimalNumber > 0) 
			{
				mod = decimalNumber % 2;
				x = mod + "" + x;
				decimalNumber = decimalNumber / 2;
			}
		}
		return x;
	}
	
	public static double findSquareRootUsingNewtonsMethod(int c, double epsilon) 
	{
		double t;
		t = c;
//		epsilon=1*(Math.pow(10, -15));
		

		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	public static boolean isPrime(int number) 
	{
		if (number == 0 || number == 1)
		{
			return false;
		} 
		else 
		{
			for (int i = 2; i <= number / 2; i++) 
			{
				if (number % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
	
	public static long CalculateFactorial(int number) 
	{
		int fact = 1;
		for (int i = 1; i <= number; i++) 
		{
			fact *= i;
		}
		return fact;
	}

	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
	{
		double result=investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		return result; 
	}

	public static double presentInvestmentValue(double investmentAmt, double d, int i) 
	{
		double result=investmentAmt / Math.pow(1 + d, i * 12);
		return result;
	}
		public static int getMax(int[] arr)
		{ 
		    int maxValue = arr[0]; 
		    for(int i=1;i < arr.length;i++)
		    { 
		      if(arr[i] > maxValue)
		      { 
		         maxValue = arr[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		public static int getMin(int[] arr)
		{ 
		    int minValue = arr[0]; 
		    for(int i=1;i < arr.length;i++)
		    { 
		      if(arr[i] < minValue)
		      { 
		         minValue = arr[i]; 
		      } 
		    } 
		    return minValue; 
		  }

		
		public static void Stopwatch() 
		{
		       double start = System.currentTimeMillis();
		} 
		public static double elapsedTime()
		{
		    	double start = System.currentTimeMillis();
		        long now = System.currentTimeMillis();
		        return (now - start) / 1000.0;
		 }
}


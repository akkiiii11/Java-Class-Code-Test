package com.ClassTest;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime Numbers Between 1 to 1000: ");
		
		for(int i=2; i<=1000; i++)
		{
			int n = 0;
			for(int j = i; j >= 1; j--)
			{
				if(i % j == 0)
				{
					n = n + 1;
				}
			}
			
			if(n == 2)
			{
				System.out.println(i+ " ");
			}
			
		}
		
	}

}
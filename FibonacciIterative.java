package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		int result = 1;
		int previous = 1;
		
		for (int i = 2; i < n; i++)  {
			int x = result;
			result = result + previous;
			previous = x;	
		}
		
		return result;
	}

}

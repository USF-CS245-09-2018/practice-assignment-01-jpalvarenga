package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}

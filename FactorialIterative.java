package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial {

	@Override
	public int factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

}

package com.recursions.imshenik.java;

public class D {

	public static void main(String[] args) {

		int n = 64;
		System.out.println(recursion(n));
	}

	private static boolean recursion(int n) {
		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return true && recursion(n / 2);
		}
		return false;
	}

}

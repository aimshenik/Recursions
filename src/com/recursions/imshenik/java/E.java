package com.recursions.imshenik.java;

/*Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).*/


public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1024;
		System.out.println(recursion(n));
	}

	private static int recursion(int n) {

		return (n == 0) ? 0 : n + recursion(n - 1);
	}

}

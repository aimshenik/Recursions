package com.recursions.imshenik.java;

/*Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.*/

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1020;
		System.out.println(recursion(n));
	}

	private static String recursion(int n) {
		return (n / 10 > 0) ? recursion(n / 10) + " " + n % 10 : n + "";
	}

}

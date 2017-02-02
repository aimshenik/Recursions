package com.recursions.imshenik.java;


//Дано натуральное число n. Выведите все числа от 1 до n.

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursion(110));
	}
	
	private static String recursion(int value) {
		return (value == 1) ? "1" : recursion(value-1)+ " " + value; 

	}

}

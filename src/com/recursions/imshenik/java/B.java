package com.recursions.imshenik.java;

//Даны два целых числа A и В (каждое в отдельной строке). 
//Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 150;
		int B = 60;

		System.out.println(recursion(A, B));
	}

	public static String recursion(int A, int B) {
		if (A < B) {
			return (A < B) ? recursion(A + 1, B) + " " + A : A + "";
		} else {
			return (A > B) ? A + " " + recursion(A - 1, B) : A + "";
		}
	}

}

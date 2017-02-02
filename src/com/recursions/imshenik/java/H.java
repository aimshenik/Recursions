package com.recursions.imshenik.java;

/*H: ѕроверка числа на простоту
ƒано натуральное число n>1. ѕроверьте, €вл€етс€ ли оно простым. 
ѕрограмма должна вывести слово YES, если число простое и NO, если число составное.
јлгоритм должен иметь сложность O(logn).
”казание. ѕон€тно, что задача сама по себе нерекурсивна, т.к. проверка числа n на простоту 
никак не сводитс€ к проверке на простоту меньших чисел. ѕоэтому нужно сделать еще один параметр рекурсии: 
делитель числа, и именно по этому параметру и делать рекурсию.*/

public class H {

	public static void main(String[] args) {

		int n = 4;
		System.out.println(recursion(n) ? "YES" : "NO");

	}

	private static boolean recursion(int n) {
		if (n==1 || n==2){return true;}
		return rec(n - 1, n);
	}

	private static boolean rec(int n, int k) {
		if (n == 1) {
			return true;
		}

		return (k % n == 0) ? false : true && rec(n - 1, k);

	}

}

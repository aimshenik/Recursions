package com.recursions.imshenik.java;

/*I: Разложение на множители
Дано натуральное число n>1. 
Выведите все простые множители этого числа в порядке неубывания с учетом кратности. Алгоритм должен иметь сложность O(logn).*/

public class I {

	public static void main(String[] args) {

		int n = 333;
		//System.out.println(recursion(n, 2));
		System.out.println(recursion(n, 2));

	}

	private static String recursion(int n, int k) {

		if (n % k == 0) {
			return k + "*" + recursion(n / k, 2);
		} else if (k >= n/2) {
			return "" + n;
		} else {
			return recursion(n, k + 1);

		}
	}

	//это решение от автора статьи. Говно какое-то.
	public static void recursion2(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++k);
        }
    }
}

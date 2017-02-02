package com.recursions.imshenik.java;

/*В теории вычислимости важную роль играет функция Аккермана A(m,n), определенная следующим образом:
image
Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
*/
public class C {

	public static void main(String[] args) {
		
		int m = 5;
		int n = 0;
		
		System.out.println(recursion(m, n));
	}

	private static int recursion(int m, int n) {
		// N+1 //m=0
		// A(m-1,1) //m>0, n=0
		// A(m-1,A(m,n-1))
		if (m >= 0 && n >= 0) {
			if (m == 0) {
				return n + 1;
			} else if (m > 0 && n == 0) {
				return recursion(m - 1, 1);
			} else if (m > 0 && n > 0) {
				return recursion(m - 1, recursion(m, n - 1));
			}

		} else {
			return -1;
		}

		return -1;

	}

}

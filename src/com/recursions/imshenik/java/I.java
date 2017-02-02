package com.recursions.imshenik.java;

public class I {

	public static void main(String[] args) {

		int n = 33;
		//System.out.println(recursion(n, 2));
		recursion2(n, 2);

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

	
	public static void recursion2(int n, int k) {
        // k- �������������� ��������. ��� ������ ������ ���� ����� 2
        // ������� ������
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // ��� �������� / ����������� �������
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } // ��� �������� / ����������� �������
        else {
            recursion(n, ++k);
        }
    }
}

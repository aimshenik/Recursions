package com.recursions.imshenik.java;

/*H: �������� ����� �� ��������
���� ����������� ����� n>1. ���������, �������� �� ��� �������. 
��������� ������ ������� ����� YES, ���� ����� ������� � NO, ���� ����� ���������.
�������� ������ ����� ��������� O(logn).
��������. �������, ��� ������ ���� �� ���� ������������, �.�. �������� ����� n �� �������� 
����� �� �������� � �������� �� �������� ������� �����. ������� ����� ������� ��� ���� �������� ��������: 
�������� �����, � ������ �� ����� ��������� � ������ ��������.*/

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

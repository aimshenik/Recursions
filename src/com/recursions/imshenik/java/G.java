package com.recursions.imshenik.java;

/*���� ����������� ����� N. �������� ��� ��� ����� �� �����, � ������� �������, �������� �� ��������� ��� ������ ��������.
��� ������� ���� ������ ������ ������������ ������, ������, ������� (�� � �����, ����������). ��������� ������ �������� � ������������� ����������.*/

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

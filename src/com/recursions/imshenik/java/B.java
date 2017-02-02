package com.recursions.imshenik.java;

//���� ��� ����� ����� A � � (������ � ��������� ������). 
//�������� ��� ����� �� A �� B ������������, � ������� �����������, ���� A < B, ��� � ������� �������� � ��������� ������.

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

package com.file;

class SecondSmallestNumber {
	public static void main(String[] args) {

		int x[] = { 10, 11, 12, 13, 14, 6, 3, };

		int small = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] < small) {
				small = x[i];
			}
		}

		int sec_Small = x[0];

		for (int i1 = 0; i1 < x.length; i1++) {
			if (x[i1] < sec_Small && x[i1] != small) {
				sec_Small = x[i1];
			}
		}

		System.out.println("Second Smallest Number: " + sec_Small);
	}
}
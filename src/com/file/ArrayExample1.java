package com.file;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {

		int[] i = { 1, 21, 15, 48, 79 };
		System.out.println(Arrays.toString(i));
		int[] i1 =Arrays.copyOf(i,3);
		Arrays.fill(i1,3);
		System.out.println(Arrays.toString(i1));
		
		
	}

}

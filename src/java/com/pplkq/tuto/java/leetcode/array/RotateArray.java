package com.pplkq.tuto.java.leetcode.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {7,1,5,3,6,4};
		rotate_brute_force(arr, 1);
		System.out.println(Arrays.deepToString(arr));
	}

	public static void rotate_brute_force(Integer arr[], int s) {
		int tmp, previous;
		for(int i=0; i<s; i++) {
			previous = arr[arr.length - 1];
			
			for(int j=0; j<arr.length; j++) {
				tmp = arr[j];
				arr[j] = previous;
				previous = tmp;
			}
		}
	}
	
}

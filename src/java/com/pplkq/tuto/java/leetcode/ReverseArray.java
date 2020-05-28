package com.pplkq.tuto.java.leetcode;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {7,1,5,3,6,4};
		reverse(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	public static void reverse(Integer arr[]) {
		int start = 0;
		int end = arr.length-1;
		int tmp;
		while(start<end) {
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
	}
	
}

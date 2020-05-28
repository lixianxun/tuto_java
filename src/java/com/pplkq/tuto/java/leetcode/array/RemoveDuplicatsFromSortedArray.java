package com.pplkq.tuto.java.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicatsFromSortedArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {0,1,1,2,2,3,4,5};
		
		System.out.println(Arrays.deepToString(arr));
		int nl = removeDuplicats(arr);
		System.out.println(Arrays.deepToString(Arrays.copyOfRange(arr, 0, nl)));
	}

	private static int removeDuplicats(Integer[] arr) {
		if(null == arr || arr.length<1) {
			return -1;
		}
		int i=0;                             //pointer 1
		for(int j=1; j<arr.length; j++) {    //pointer 2
			if(arr[i] != arr[j]) {
				arr[++i] = arr[j];
			}
		}
		return i+1;
	}
}

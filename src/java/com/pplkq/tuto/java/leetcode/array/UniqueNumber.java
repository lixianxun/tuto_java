package com.pplkq.tuto.java.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumber {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,5,2,3,1};
		System.out.println(justDoIt(arr));
		System.out.println(justDoIt2(arr));
	}
	
	/**
	    XOR 
	 */
	public static int justDoIt2(Integer arr[]) {
		int a = 0;
	    for (int i : arr) {
	      a ^= i;
	    }
	    return a;
	}

	public static int justDoIt(Integer arr[]) {
		List<Integer> unique = new ArrayList<Integer>();
		for(Integer item : arr) {
			if(!unique.contains(item)) {
				unique.add(item);
			}else {
				unique.remove(item);
			}
			System.out.println(unique);
		}
		return unique.get(0);
	}
	
}

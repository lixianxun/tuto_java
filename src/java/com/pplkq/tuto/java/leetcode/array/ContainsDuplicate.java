package com.pplkq.tuto.java.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {7,1,5,3,6,4,1};
		System.out.println(justDoIt(arr));
		System.out.println(justDoIt2(arr));
		System.out.println(justDoIt3(arr));
	}

	public static boolean justDoIt3(Integer arr[]) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			if(set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
	
	public static boolean justDoIt2(Integer arr[]) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean justDoIt(Integer arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}

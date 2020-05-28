package com.pplkq.tuto.java.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {1,2,3,5,2,3,1};
		Integer[] arr2 = new Integer[] {1,2,3};
		System.out.println(Arrays.deepToString(justDoIt(arr1, arr2)));
	}
	
	public static Object[] justDoIt(Integer[] arr1, Integer[] arr2) {
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));
		set1.retainAll(set2);
		
		List<Integer> ret = new ArrayList<Integer>();
		ret.addAll(set1);
		return ret.toArray();
	}

}

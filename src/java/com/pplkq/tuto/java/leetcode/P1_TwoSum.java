package com.pplkq.tuto.java.leetcode;

import java.util.Map;

import com.google.common.collect.Maps;

public class P1_TwoSum {

	public static void main(String[] args) {
		int target = 9;
		int[] nums = {2,11,3,6,7};
		
		Map<Integer, Integer> map = Maps.newHashMap();
		for(int i=0; i<nums.length; i++) {
			int tmp = target - nums[i];
			if(map.containsKey(tmp)) {
				System.out.println(i + "  " + map.get(tmp));
			} else {
				map.put(nums[i], i);
			}
		}
	}
}

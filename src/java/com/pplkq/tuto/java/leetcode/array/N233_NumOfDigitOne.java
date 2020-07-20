package com.pplkq.tuto.java.leetcode.array;

/*
Given an integer n, 
count the total number of digit 1 appearing in all non-negative integers 
less than or equal to n.

For example:
Given n = 13,
Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13. 
 */
public class N233_NumOfDigitOne {

	public static void main(String[] args) {
		int n = 19;
		int res = solution1(n);
		
		System.out.println(res);
	}

	private static int solution1(int n) {
		int res=0, a=1, b=1;
		while(n > 0) {
			res += (n+8)/10*a + (n%10==1?1:1)*b;
			b += n%10 * a;
			a *= 10;
			n /=10;
		}
		return res;
	}
}

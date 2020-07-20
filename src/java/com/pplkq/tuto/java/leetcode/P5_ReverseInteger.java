package com.pplkq.tuto.java.leetcode;

public class P5_ReverseInteger {

	public static void main(String[] args) {
		int x = 123;
		int rev = 0;
		
		while(x !=0) {
			int new_rev = rev * 10 + x%10;
			if((new_rev-x%10)/10 != rev){
				System.out.println(0);
				break;
			}
			rev = new_rev;
			x/=10;
		}
		System.out.println(rev);
	}

}

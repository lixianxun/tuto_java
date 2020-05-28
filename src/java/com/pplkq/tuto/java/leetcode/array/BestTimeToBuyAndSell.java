package com.pplkq.tuto.java.leetcode.array;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {7,1,5,3,6,4};
		int p = calculate_s_one(arr, 0);
		System.out.println(p);
	}

	public static int calculate_s_one(Integer prices[], int s) {
		int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
	}
	
	
	public static int calculate_brute_force(Integer prices[], int s) {
        if (s >= prices.length)
            return 0;
        
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate_brute_force(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }
}

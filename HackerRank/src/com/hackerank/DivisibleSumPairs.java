package com.hackerank;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		int arr [] = new int [] {5, 9, 10, 7, 4};
		System.out.println(divisibleSumPairs(5, 2, arr));
	}
	
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int sum = 0;
		int divisibleSumPairs = 0;
		if(n>0) {
			for (int i = 0; i < ar.length; i++) {
				for (int j = i+1; j < ar.length; j++) {
						sum = ar[i]+ar[j];
						if(sum % k == 0) {
							divisibleSumPairs++;
						}
				}
			}
		}
		return divisibleSumPairs;
    }
}

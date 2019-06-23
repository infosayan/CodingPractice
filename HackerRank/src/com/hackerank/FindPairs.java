package com.hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindPairs {

	public static void main(String[] args) {
		findPairs();
	}

	
	/**
	 * 
	 */
	private static void findPairs() {
		int [] arr = new int[] {4, 5, 5, 2, 3, 3, 4, 4, 3};
		Integer [] intg = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intg[i] = Integer.valueOf(arr[i]);
		}
		List<Integer> var = new ArrayList<>();
		int freqCount = 0;
		int pairs = 0;
		for (Integer integer : Arrays.asList(intg)) {
			if(!var.contains(integer)) {
				freqCount = Collections.frequency(Arrays.asList(intg), integer);
				System.out.println(integer + " " +freqCount);
				var.add(integer);
				if(freqCount >= 2) {
					pairs += freqCount/2;
				}
			}
		}
		System.out.println("Pairs-"+pairs);
	}
}

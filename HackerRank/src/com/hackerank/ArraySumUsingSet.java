package com.hackerank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {
	public static void main(String args[]) {
		int arr [] = new int []{4,2,5,1,7,-1,5,6,0,3,4,3};
		prettyPrint(arr, 6);
		//prettyPrint(getRandomArray(3), 12);
	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<Integer>(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	} 

	public static void prettyPrint(int[] random, int k) {
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals " + k);
		printPairsUsingSet(random, k);
	}

	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}
}

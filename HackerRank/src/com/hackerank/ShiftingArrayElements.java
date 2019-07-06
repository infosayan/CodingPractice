package com.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftingArrayElements {

	public static void main(String[] args) {
		int arr [] = new int []{4,2,1,3,0,5,0,1,6,0,1};
		shiftingZerosOnesInArray(arr);
	}

	private static void shiftingZerosOnesInArray(int[] arr) {
		List<Integer> list1 = new ArrayList<>(arr.length);
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
			if(arr[i]!=1 && arr[i]!=0) {
				list2.add(arr[i]);
			}
		}
		Collections.sort(list1);
		list1 = list1.parallelStream().filter(a -> (a==0||a==1)).collect(Collectors.toList());
		list1.addAll(list2);
		System.out.println(list1);
	}

}

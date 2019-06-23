package com.hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		int arr1[] = {2,6,4,1,5,13};
		int arr2[] = {2,1,9,1,6,11};
		Integer[] boxedArray1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
		Integer[] boxedArray2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
		
		Object[] objArr = missingElements(boxedArray1, boxedArray2);
		
		Arrays.stream(objArr).forEach(a -> System.out.print(a + " "));

	}

static Object[] missingElements(Integer[] array1, Integer[] array2) {
		
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		List<Integer> missingElements = new ArrayList<>();
		for (Integer integer : list1) {
			if(!list2.contains(integer)) {
				missingElements.add(integer);
			}
		}
		return missingElements.toArray();
	}
}

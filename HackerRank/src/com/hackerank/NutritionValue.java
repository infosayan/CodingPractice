package com.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NutritionValue {

	public static void main(String[] args) {
		System.out.println(nutritionValue(4,5));
	}

	static int nutritionValue(int val, int ignoreValue) {
		List<Integer> values = new ArrayList<>();
		int maxValue = 0;
		for (int i = 1; i <= val; i++) {
			for (int j = i+1; j <= val; j++) {
				for (int k = j+1; k <= val; k++) {
					if(i+j+k!=ignoreValue) {
						values.add(i+j+k);
					}
				}
				
			}
		}
		//System.out.println(values);
		maxValue = Collections.max(values);
		return maxValue;
	}
}

package com.hackerank;

import java.util.HashMap;

public class SumToZero {

	public static void main(String[] args) {
			sumToZero();
	}

	
	/**
	 * 
	 */
	private static void sumToZero() {
		int arr [] = { 4, -2, 1, 1, -2, 5, -4, 3};
		
		if (subArrayExists(arr)) 
            System.out.println("Found a subarray with 0 sum"); 
        else
            System.out.println("No Such Sub Array Exists!");
	}



	private static boolean subArrayExists(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        int sum = 0;      
        for (int i = 0; i < arr.length; i++) 
        {  
            sum += arr[i]; 
            if (arr[i] == 0 || sum == 0 || map.containsKey(sum)) {                          
                return true; 
            }
            map.put(sum, i); 
        }  
        return false; 
	}
}

package com.hackerank;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {

		//System.out.println(twoStrings("abc", "def"));
		
	}

	@SuppressWarnings("unused")
	static String twoStrings(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if(s2.indexOf(arr1[i]) != -1) {
				return "YES";
			}else {
				continue;
			}
		}
		return "NO";
    }
}

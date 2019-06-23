package com.hackerank;

public class AlternateArray {

	public static void main(String[] args) {
		alternateArray();

	}

	private static void alternateArray() {
		Integer [] intArray = new Integer[] {1,4,5,7,3,9,2,0,6,8};
		int count3rd = 0;
		int count5th = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (count5th ==0) {
				count3rd++;
			}
			if (count3rd == 0) {
				count5th++;
			}
			if(count3rd == 3) {
				System.out.print(intArray[i] + " ");
				count3rd = 0;
				count5th++;
			}
			if(count5th == 5) {
				System.out.print(intArray[i] + " ");
				count5th = 0;
				count3rd++;
			}
		}
	}

}

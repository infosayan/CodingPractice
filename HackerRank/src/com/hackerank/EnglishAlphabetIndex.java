package com.hackerank;

import java.util.HashMap;
import java.util.Map;

public class EnglishAlphabetIndex {

	public static void main(String[] args) {
		englishAlphabetIndex();
	}
	
	/**
	 * 
	 */
	private static void englishAlphabetIndex() {
		Map<Character , Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 97; i < 123; i++) {
			map.put((char)i, index);
			index++;
		}
        String word = "samit";
        char letter=' ';
        for (int i = 0; i < word.length(); i++) {
			 letter = word.charAt(i);
			 System.out.println("Index for each letter : "+letter+"="+map.get(letter));
		}
	}
}

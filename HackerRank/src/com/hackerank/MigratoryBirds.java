package com.hackerank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class MigratoryBirds {

	public static void main(String[] args) {
		Integer arr [] = new Integer [] {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
		System.out.println(migratoryBirds(Arrays.asList(arr)));
	}

	static int migratoryBirds(List<Integer> arr) {
		int freqCount = 0;
		int idCount = 0;
		Map<Integer, Integer> hashMap = new HashMap<>();
		if(arr.size()>0) {
			for (Integer integer : arr) {
				freqCount = Collections.frequency(arr, integer);
				if(freqCount > 0) {
					hashMap.put(integer, freqCount);
				}
			}
		}
		System.out.println(hashMap);
		Map<Integer, Integer> sortedMap = 
				hashMap.entrySet().stream()
			    .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
			    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                              (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedMap);
		Entry<Integer, Integer> entry = sortedMap.entrySet().iterator().next();
		int valCount = Collections.frequency(sortedMap.values(), entry.getValue());
		if(valCount>1) {
			idCount = Collections.min(getKeysByValue(sortedMap, entry.getValue()));
		}else {
			idCount = entry.getKey();
		}
		return idCount;
    }

	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
	    Set<T> keys = new HashSet<T>();
	    for (Entry<T, E> entry : map.entrySet()) {
	        if (Objects.equals(value, entry.getValue())) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
}

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeMain {

	public static void main(String[] args) {
		//alternateArray();
        
        //englishAlphabetIndex();
		
		//findPairs();
		
		//repeatedString();
		
		//sumToZero();
		
//		List<Integer> list = new ArrayList<>();
//		list.add(30);
//		list.add(5);
//		list.add(4);
//		list.add(8);
//		list.add(19);
//		list.add(89);
//		System.out.println(finalInstances(5, list));
		
//		int arr [] = new int [] {5, 9, 10, 7, 4};
//		System.out.println(divisibleSumPairs(5, 2, arr));
		
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

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int sum = 0;
		int divisibleSumPairs = 0;
		if(n>0) {
			for (int i = 0; i < ar.length; i++) {
				for (int j = i+1; j < ar.length; j++) {
						sum = ar[i]+ar[j];
						if(sum % k == 0) {
							divisibleSumPairs++;
						}
				}
			}
		}
		return divisibleSumPairs;
    }
	
	
	
	
	public static int finalInstances(int instances, List<Integer> averageUtil) {
		if(averageUtil!=null && averageUtil.size()>0) {
			//averageUtil.remove(0);
			//averageUtil.remove(1);
			ListIterator<Integer> averageUtilValues = averageUtil.listIterator();
			int counter = 0;
			while(averageUtilValues.hasNext()) {
				if(counter>0) {
					counter --;
					continue;
				}
				if(instances==1) {
					if(averageUtilValues.next().intValue() > 60) {
						instances = instances * 2;
						break;
					}
				}else {
					if(averageUtilValues.next().intValue() < 25) {
						instances = (int) Math.ceil(new Double(instances) / 2.0);
						counter = 10;
						continue;
					}else if(averageUtilValues.next().intValue() > 60) {
						instances = instances * 2;
						counter = 10;
						continue;
					}else{
                        continue;
                    }
				}
			}
		}
		return instances;
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


	/**
	 * 
	 */
	private static void repeatedString() {
		String repeatedString = "asdwer";
		//long number = 736778906400;
		BigInteger bigNumber = new BigInteger("223344");
		//int integerNum = (int) number;
		String concatenatedString = "";
		 if(repeatedString.equals("a")) {
			 System.out.println(bigNumber.intValue());
	        }else if(!repeatedString.equals("a") && repeatedString.length()==1){
	        	System.out.println("0");
	        }else {
			/*for(int i=0;i<integerNum ;i++) {
				concatenatedString += repeatedString;
			}*/
			concatenatedString = new String(new char[bigNumber.intValue()]).replace("\0", repeatedString);
			System.out.println("Concatenated string : "+concatenatedString);
			String c = concatenatedString.trim().substring(0, bigNumber.intValue() );
			long counter = 0;
		    for (int i = 0; i < c.length(); i++) {
		      if (c.charAt(i)=='a')
		        counter++;
		    }
		    System.out.println(counter + " letters.");
		}
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

	
	/**
	 * 
	 */
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

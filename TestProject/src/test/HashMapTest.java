package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		StringTest string1 = new StringTest("a");
		StringTest string2 = new StringTest("b");
		StringTest string3 = new StringTest("c");
		Map<StringTest, String> map = new HashMap<StringTest, String>();
		map.put(string1, "a");
		map.put(string2, "b");
		map.put(string3, "c");
		
		map.get(string1);
		map.get(string2);
		map.get(string3);
		
		int a = 4;
		int b = 5;
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("b "+b);
		System.out.println("a "+a);
		
	}
}

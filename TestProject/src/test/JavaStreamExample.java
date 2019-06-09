package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(1, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(4, "Apple Laptop", 90000));
		productsList.forEach(product -> System.out.println(product.price));
		List<Integer> productPriceList2 = productsList.stream().filter(p -> p.price < 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
		Collections.sort(productsList, new Product());
		System.out.println(productsList);
		productsList.forEach(product -> System.out.println(product.id));

		int x = 10;
		int y;
		y = x++;
		System.out.println(y + " " + x);
		System.out.println(y);
		List<String> linkedList = new LinkedList<String>();

		// Creating a ConcurrentHashMap

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		// Adding elements to map

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		// Getting an Iterator from map
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			// map.remove("TWO", 2); //This will not be reflected in the Iterator
			if (map.get("TWO").equals(2))
				it.remove();
		}

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();

		// Adding elements to list

		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(3845);

		// Getting an Iterator from list
		Iterator<Integer> itr = list.iterator();
		/*
		 * while (itr.hasNext()) { //Integer integer = (Integer) itr.next();
		 * //System.out.println("integer: "+integer); if(itr.next() == 8741) {
		 * list.remove(1452); //This will throw ConcurrentModificationException } }
		 */

		Functional functional = (a) -> {
			System.out.println("div" + a);
			return a;
		};
		functional.add();
		Functional.sub();

	}

}

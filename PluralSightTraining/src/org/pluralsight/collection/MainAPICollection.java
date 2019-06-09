package org.pluralsight.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainAPICollection {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alice", 23);
		Person p2 = new Person("Brian", 56);
		Person p3 = new Person("Chelsea", 46);
		Person p4 = new Person("David", 28);
		Person p5 = new Person("Erica", 37);
		Person p6 = new Person("Francisco", 18);
		
		List<Person> people = new ArrayList<Person>(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		//people.removeIf(person -> person.getAge() < 30);
		
		///people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
		
		people.sort(Comparator.comparing(Person::getAge).reversed());
		people.forEach(person -> System.out.println("Age reversed: "+person));
		
		City newYork = new City("New York");
		City shangai = new City("Shangai");
		City paris = new City("Paris"); 
		
		Map<City, List <Person>> map = new HashMap<>();
		
		map.putIfAbsent(paris, new ArrayList<>());
		map.get(paris).add(p1);
		map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
		map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);
		
		System.out.println("People from Paris : " +map.getOrDefault(paris, Collections.EMPTY_LIST));
		System.out.println("People from New York : " +map.getOrDefault(newYork, Collections.EMPTY_LIST));
		
		Map<City, List <Person>> map1 = new HashMap<>();
		map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p2);
		map1.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p3);
		
		System.out.println("Map 1");
		map1.forEach((city, person) -> System.out.println(city + " " + person));
		
		Map<City, List <Person>> map2 = new HashMap<>();
		map2.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);
		
		System.out.println("Map 2");
		map2.forEach((city, person) -> System.out.println(city + " " + person));
		
		map2.forEach(
				(city, person) -> {
					map1.merge(
							   city, person, 
							   	 (personFromMap1, personFromMap2) -> {
							   		 personFromMap1.addAll(personFromMap2);
							   		 	return personFromMap1;
							   });
				}
		);
		
		System.out.println("Merged Map 1 : ");
		map1.forEach((city, person) -> System.out.println(city + " " + person));
	}
}

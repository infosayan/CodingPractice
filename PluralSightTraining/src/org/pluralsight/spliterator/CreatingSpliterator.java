package org.pluralsight.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreatingSpliterator {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\Users\\m1049799\\workspace\\PluralSightTraining\\src\\org\\pluralsight\\spliterator\\person.txt");
		
		try (Stream<String> lines = Files.lines(path)){
			
			Spliterator<String> lineSpliterator = lines.spliterator();
			Spliterator<Person> peopleSpliterator = new PersonSpliterator(lineSpliterator);
			
			Stream<Person> people = StreamSupport.stream(peopleSpliterator, false);
			people.forEach(System.out::println);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
}

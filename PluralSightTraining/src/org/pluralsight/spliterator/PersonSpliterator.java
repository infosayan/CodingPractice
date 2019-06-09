package org.pluralsight.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Person> {

	private final Spliterator<String> lineSpliterator;
	private String name;
	private String city;
	private int age;

	public PersonSpliterator(Spliterator<String> lineSpliterator) {
		this.lineSpliterator = lineSpliterator;
	}
	
	@Override
	public boolean tryAdvance(Consumer<? super Person> action) {
		if (this.lineSpliterator.tryAdvance(line -> this.name = line) &&
			this.lineSpliterator.tryAdvance(line -> this.city = line) &&
			this.lineSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line))) {
			
			Person person = new Person(name, city, age);
			action.accept(person);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Spliterator<Person> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return lineSpliterator.estimateSize()/3;
	}

	@Override
	public int characteristics() {
		return lineSpliterator.characteristics();
	}

}

package org.pluralsight.functional;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

	public int compare(T t1, T t2);
	
	public default Comparator<T> thenComparing(Comparator<T> cmp){
		
		return (t1, t2) -> compare(t1, t2) == 0 ? cmp.compare(t1, t2) : compare(t1, t2); 
	}
	
	public default Comparator<T> thenComparing(Function<T, Comparable> f){
		
		return thenComparing(comparing(f)); 
	}
	
	public static <U> Comparator<U> comparing(Function<U, Comparable> f){
		
		return (t1, t2) -> f.apply(t1).compareTo(f.apply(t2));
	}
	
}

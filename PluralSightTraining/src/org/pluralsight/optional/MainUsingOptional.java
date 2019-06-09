package org.pluralsight.optional;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainUsingOptional {

	public static void main(String[] args) {
		
//		List<Double> result = new ArrayList<>();
//		
//		ThreadLocalRandom.current()
//						.doubles(10_000).boxed().parallel()
//						.forEach(
//								d -> NewMath.inv(d)
//									.ifPresent(
//											inv -> NewMath.sqrt(inv)
//													.ifPresent(
//																sqrt -> result.add(sqrt)
//															)
//											)
//								
//								);
//		System.out.println("# result = "+ result.size());
		
		Function<Double, Stream<Double>> flatMapper =
				d -> NewMath.inv(d)
					.flatMap(inv -> NewMath.sqrt(inv))
					.map(sqrt -> Stream.of(sqrt))
					.orElseGet(() -> Stream.empty());
				
		
		List<Double> rightResult = 
				ThreadLocalRandom.current().doubles(10000).parallel()
					.map(d -> d*20 - 10)
					.boxed()
					.flatMap(flatMapper)
					.collect(Collectors.toList());
		
		System.out.println("# result = "+ rightResult.size());
				
	}
}

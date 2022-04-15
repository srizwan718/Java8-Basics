package com.java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// java.util.stream intervace is centre of Java8 API streams, which contains many operations such as filter, 
// sorted, map, forEach, min, max, findAny, findFirst, anyMatch, nonMatch, 


// intermediate opeartions are : filter, sorted, distinct
// terminal operators are : count, min, max, 
// Streams can be defined as sequence of data from source,
// in collections we can store and process data, but streams provide some operations to perform on data
// streams are not a data struvtures
// Streams provides many operations to perform data prcessing 
// streams are traversed only once, 2nd time its not possible

// short circuiting operators such as findFirst, findAny, limit... here it didn't need whole stream to be processed so its called as 
// short circuiting operators

public class streamvsParallelStreamDemo {
	
	public static List<String> Stringlist(){
		List<String> list = Arrays.asList("apple","banana","carrot","juice","apple","banana","carrot","juice");
	return list;
	}
	
	public static List<Integer> Intlist(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,2);
	return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("apple","banana","carrot","juice","apple","banana","carrot","juice");
		/*
		 * list.stream().forEach(System.out::println);
		 * list.stream().forEach(System.out::println); // parallelSTreams used to gain
		 * performance on large amount of data
		 * list.parallelStream().forEach(System.out::println);
		 */
		
		Stream<String> stream = list.stream();
		//stream.forEach(System.out::println);
		//stream.forEach(System.out::println);
		
		FilterDemo();
		reduceDemo();
	}

	private static void reduceDemo() {
		// TODO Auto-generated method stub
		Optional<Integer> optional = Intlist().stream().reduce((a,b) -> a+b);
		Integer integer = optional.get();
		System.out.println(integer);
	}

	private static void FilterDemo() {
		// TODO Auto-generated method stub
		
		//Stringlist().stream().distinct().filter(i -> i.length()>5).forEach(System.out::println);
		 //Stringlist().stream().limit(2).forEach(System.out::println);
		//Stringlist().stream().forEach(System.out::println);
		 // skip is used to skip elements from streams
		// Stringlist().stream().
		System.out.println("__________");
		//Stringlist().stream().skip(3).forEach(System.out::println);
		Optional<String> findAny = Stringlist().stream().findAny();
		
		System.out.println(findAny.get());
		
	}
	


}

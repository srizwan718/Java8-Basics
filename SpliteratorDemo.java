package com.java8.com;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

// as name suggested it performs 2 operatios , split+ iterator..
// till java7, we had enumerator, iterator, listIterator to traverse elements in colections.
// from java8 onwards spliterator has been introduced to addition of traversing elements in collections, arrays, streams.
// this is a default method in iteratble function added..it is used in parallel processing and it contains many usful methods ...will
// go through them one by one now
public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String s[]= {"java", "oracle","Django","python","c"}; Spliterator<String>
		 * spliterator = Arrays.spliterator(s);
		 * spliterator.tryAdvance(System.out::println);
		 * System.out.println("*************************");
		 * spliterator.forEachRemaining(System.out::println);
		 */

List<String> list = Arrays.asList("java", "oracle","Django","python","c");
Spliterator<String> spliterator2 = list.spliterator();
Spliterator<String> trySplit = spliterator2.trySplit();
System.out.println("*************list spliterator************");
spliterator2.forEachRemaining(System.out::println);

System.out.println("*********try spliterator***********");
trySplit.forEachRemaining(System.out::println);

/*
 * Stream<String> stream = Stream.of("java", "oracle","Django","python","c");
 * System.out.println("*************stream spliterator************");
 * Spliterator<String> spliterator3 = stream.spliterator();
 * spliterator3.forEachRemaining(System.out::println);
 */
	}

}

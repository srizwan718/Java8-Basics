package com.java8.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeDemo {

	public static <R> void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1, imperative style prming, summation of 0 to 100
		int count=0;
		for(int i=0;i<=100;i++) {
			count+=i;
		}
		System.out.println("summation of 0 to 100---->"+count);
		
		// another impertaive example, remove elements
		
		List<Integer> list = Arrays.asList(1,2,3,4,2,3,6);
		
		ArrayList<Integer> uniqueList = new ArrayList<>();
		
		for(Integer i:list) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println(uniqueList);
		
		
		// 2, declarative style of prming
		
	int sum = IntStream.rangeClosed(0, 100).sum();
System.out.println(sum);
List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
System.out.println(list2);

	}

}

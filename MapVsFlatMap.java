package com.java8.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Institute> list = new ArrayList<Institute>();
		
		Institute institute = new Institute("VIT", Arrays.asList("Chennai", "Vellore", "Hyderabad"));
		Institute institute2 = new Institute("IIT", Arrays.asList("Chennai", "Mumbai", "Hyderabad"));
		Institute institute3 = new Institute("IIIT", Arrays.asList("Chennai", "Kurnool", "Hyderabad"));
		
		list.add(institute);
		list.add(institute2);
		list.add(institute3);
		
		System.out.println(list);
		
		list.stream().map(Institute::getName).forEach(System.out::println);
		Set<String> collect = list.stream().flatMap(Institute -> Institute.getLocations().stream()).collect(Collectors.toSet());

		System.out.println(collect);
	}

}

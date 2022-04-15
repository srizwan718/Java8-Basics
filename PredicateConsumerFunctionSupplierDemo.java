package com.java8.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateConsumerFunctionSupplierDemo {

	
	private static final String Student = null;

	public static List<Student> studentList(){
ArrayList<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(new Student(1, "Rayan", "Maths", 100));
		studentlist.add(new Student(2, "Adib", "Physics", 90));
		studentlist.add(new Student(3, "Faraz", "Science", 80));
		studentlist.add(new Student(4, "Nawaz", "Telugu", 40));
		studentlist.add(new Student(5, "Rizwan", "Maths", 98));
		return studentlist;
	}
	
	public static void main(String[] args) {
		List<Student> collect1 = studentList().stream().collect(Collectors.toList());
		System.out.println(collect1);
		predicateStudentDemo();
	}

	private static void predicateStudentDemo() {
		List<Student> collect = studentList().stream().collect(Collectors.toList());
		Predicate<Student> mathematicsPredicate =	
				(Student s) -> s.getSubject().equalsIgnoreCase("Maths");
				//Student::getSubject().equalsIgnoreCase("Maths");
				ArrayList<Student> emptyList = new ArrayList<Student>();
				
				for(Student s1:  collect) {
					if(mathematicsPredicate.test(s1)) {
					emptyList.add(s1);
					}
				}
				
				System.out.println("emptyList--->"+emptyList);
		
	}

}

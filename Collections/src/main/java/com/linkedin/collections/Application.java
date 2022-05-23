package com.linkedin.collections;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);

		NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

		numberTree.stream()
				.forEach(System.out::println);

		System.out.println("--------------------");
		numberTree.descendingSet()
				.stream()
				.forEach(System.out::println);

		System.out.println("--------------------");
		numberTree.headSet(1750)
				.stream()
				.forEach(System.out::println);

		System.out.println("--------------------");
		numberTree.tailSet(1700)
				.stream()
				.forEach(System.out::println);

		System.out.println("--------------------");
		numberTree.subSet(1600, 3000)
				.stream()
				.forEach(System.out::println);

		System.out.println("--------------------");
		System.out.println(numberTree.lower(750));
		System.out.println("--------------------");
		System.out.println(numberTree.higher(750));
	}
}

package com.csm.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface ExampleI {
	void Display(int a, int b);
}

public class LambdaExpression {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t=new Thread(()->{ System.out.println("Thread");  });
		t.start();
		
		
		/* 1 Lambda Expression */
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
		};

		Thread thread = new Thread(r);
		thread.start(); // OUTPUT: 1 2 3 4 5
		thread.join();

		/* 2 Interface Method call */
		ExampleI e = (a, b) -> {
			System.out.println("\nSum: " + a + b);
		};

		e.Display(2, 3); // OUTPUT: Sum: 23

		/* 3 Lambda Expression */
		List<Integer> l = new ArrayList<>();
		l.add(11);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);

		List<Integer> collect = l.stream().filter(n -> n < 20).collect(Collectors.toList());
		System.out.println("\nFilter Data = " + collect); // OUTPUT: Filter Data = [11, 15]

		List<Integer> c = l.stream().filter(data -> !data.equals(15)).collect(Collectors.toList());
		System.out.println("c = " + c);

		/* 4 Lambda Expression */
		List<String> l1 = new ArrayList<>();
		l1.add("Cat");
		l1.add("Boy");
		l1.add("Apple");
		l1.add("Elephant");
		l1.add("Donkey");

		/* By using Filter We can remove or Filter */
		List<String> collect1 = l1.stream().filter(m -> !m.equals("Donkey")).sorted().collect(Collectors.toList());
		System.out.println(collect1); // OUTPUT: [Cat, Boy, Apple, Elephant]

		/* By using MAP We can remove or Set The value */
		List<String> collect2 = l1.stream().map(m -> m.equals("Donkey") ? "Dom" : m).collect(Collectors.toList());
		System.out.println(collect2); // OUTPUT: [Cat, Boy, Apple, Elephant, Dom]

		List<String> collect3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(collect3); // OUTPUT: [Apple, Boy, Cat, Donkey, Elephant]
	
		/* 4 Lambda Expression */

		List<String> asList = Arrays.asList("Cat", "Apple", "Boy");
		List<String> collect4 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect4);

		Integer a[] = new Integer[] { 40, 20, 10, 40 };
		List<Integer> list = Arrays.asList(a);
		list.forEach(item -> {
			System.out.println(item);
		});

		List<Integer> l2 = Arrays.asList(2, 6, 4, 3, 9, 7);

		List<Integer> c2 = l2.stream().sorted((m,n) -> n.compareTo(m)).collect(Collectors.toList());

		System.out.println(c2);

	}

}
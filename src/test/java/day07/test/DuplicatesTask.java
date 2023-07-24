package day07.test;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesTask {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		numbers.add(6);
		numbers.add(2);

		HashSet<Integer> uniquenumbers = new HashSet<>(numbers);

		System.out.println("Unique values:");
		for (int num : uniquenumbers) {
			System.out.println(num);
		}
	}

}

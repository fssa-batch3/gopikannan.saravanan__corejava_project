package day09.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortListTest {

	@Test
	void testSorted() {

		List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> expectedSortedNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		Collections.sort(num);

		assertEquals(expectedSortedNum, num, "Sorted list should remain unchanged after sorting");
	}

	@Test
	void testUnsorted() {

		List<Integer> num = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
		List<Integer> expectedSortedNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		Collections.sort(num);

		assertEquals(expectedSortedNum, num, "List should be sorted correctly after sorting");
	}
}

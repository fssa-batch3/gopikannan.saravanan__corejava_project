package day09.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import day09.practice.TaskList;

public class TaskNameTest {

	@Test
	void test1() {
		List<TaskList> taskList = new ArrayList<>();

		taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-22")));
		taskList.add(new TaskList(5, "Product Design", LocalDate.parse("2022-10-01")));
		taskList.add(new TaskList(1, "Software Design", LocalDate.parse("2022-10-07")));
		taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-21")));

		Collections.sort(taskList);

		assertEquals("Product Design", taskList.get(0).getName());
		

		assertEquals(LocalDate.parse("2022-10-01"), taskList.get(0).getDeadline());
		
	}
	@Test
	void test2() {
		List<TaskList> taskList = new ArrayList<>();

		taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-22")));
		taskList.add(new TaskList(5, "Product Design", LocalDate.parse("2022-10-01")));
		taskList.add(new TaskList(1, "Software Design", LocalDate.parse("2022-10-07")));
		taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-21")));

		Collections.sort(taskList);

		assertNotEquals("Coding", taskList.get(0).getName());
		

		assertNotEquals(LocalDate.parse("2022-10-21"), taskList.get(0).getDeadline());
		
	}
}

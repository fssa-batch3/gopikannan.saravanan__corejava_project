package day07.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day07.practice.Task;

public class TaskDuplicatesTest {
	public static void main(String[] args) {
		List<Task> taskList = new ArrayList<>();

		taskList.add(new Task("Task 1", 1, LocalDate.parse("2023-07-18")));
		taskList.add(new Task("Task 2", 2, LocalDate.parse("2023-07-19")));
		taskList.add(new Task("Task 3", 3, LocalDate.parse("2023-07-18")));
		taskList.add(new Task("Task 1", 4, LocalDate.parse("2023-07-18")));
		taskList.add(new Task("Task 4", 5, LocalDate.parse("2023-07-20")));
		taskList.add(new Task("Task 2", 6, LocalDate.parse("2023-07-19")));

		Set<Task> taskSet = new HashSet<>(taskList);

		taskList.clear();
		taskList.addAll(taskSet);

		for (Task task : taskList) {
			System.out.println("Task Id: " + task.getId());
			System.out.println("Task Name: " + task.getTaskName());
			System.out.println("Task Deadline: " + task.getDeadline());
			System.out.println();
		}
	}

}

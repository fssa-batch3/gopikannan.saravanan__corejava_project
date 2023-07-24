package day06.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import day06.practice.FindTaskName;
import day06.practice.Task;
import day06.solved.*;

public class FindTaskNameTest {
	@Test
	 void test1() {

		ArrayList<Task> taskList = new ArrayList<>();
		FindTaskName name = new FindTaskName();
		Task task1 = new Task("Wake up early", 1);
		taskList.add(task1);
		Task task2 = new Task("Have a Bath", 2);
		taskList.add(task2);
		Task task3 = new Task("Get ready for Office", 3);
		taskList.add(task3);
		Task task4 = new Task("Do the office work", 4);
		taskList.add(task4);
		String searchName = "Get ready for Office";
		boolean taskExists = name.findTaskByName(searchName, taskList);
		System.out.println("Task with name " + searchName + " exists: " + taskExists);

	}

	

}

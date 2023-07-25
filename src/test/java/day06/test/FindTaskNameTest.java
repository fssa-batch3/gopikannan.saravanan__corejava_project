package day06.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import day06.practice.FindTaskName;
import day06.practice.Task;
import day06.solved.*;

public class FindTaskNameTest {
	@Test
	 void test1() {

		ArrayList<Task> TaskArray = new ArrayList<>();
		FindTaskName name = new FindTaskName();
		Task task1 = new Task(1,"Wake up early","Done");
		TaskArray.add(task1);
		Task task2 = new Task(2,"Have a Bath","Done");
		TaskArray.add(task2);
		Task task3 = new Task(3,"Get ready for Office","Done");
		TaskArray.add(task3);
		Task task4 = new Task(4,"Check Calendar","Pending");
		TaskArray.add(task4);
		
		String searchName = "Get ready for Office";
		boolean taskExists = name.findTaskByName(searchName, TaskArray);
		System.out.println("Task with name " + searchName + " exists: " + taskExists);

	}

	

}

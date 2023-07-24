package day07.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day07.practice.TaskOne;

public class TaskOneTest {
	public static void main(String[] args) {

		List<TaskOne> taskList = new ArrayList<>();

		taskList.add(new TaskOne("Task 1", "2023-07-18"));
		taskList.add(new TaskOne("Task 2", "2023-07-19"));
		taskList.add(new TaskOne("Task 3", "2023-07-18"));
		taskList.add(new TaskOne("Task 1", "2023-07-18"));
		taskList.add(new TaskOne("Task 4", "2023-07-20"));
		taskList.add(new TaskOne("Task 2", "2023-07-19"));

		Set<TaskOne> taskSet = new HashSet<>(taskList);
		taskList.clear();
		taskList.addAll(taskSet);

		for (TaskOne task : taskList) {
			System.out.println("Task: " + task.getName() + ", Deadline: " + task.getDeadline());
		}
	}

}

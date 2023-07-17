package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTaskName {

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.getTaskName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<Task> taskList = new ArrayList<>();

		Task task1 = new Task("Wake up early", 1);
		taskList.add(task1);
		Task task2 = new Task("Have a Bath", 2);
		taskList.add(task2);
		Task task3 = new Task("Get ready for Office", 3);
		taskList.add(task3);
		Task task4 = new Task("Do the office work", 4);
		taskList.add(task4);
		String searchName = "Get ready for Office";
		boolean taskExists = findTaskByName(searchName, taskList);
		System.out.println("Task with name " + searchName + " exists: " + taskExists);

	}
}

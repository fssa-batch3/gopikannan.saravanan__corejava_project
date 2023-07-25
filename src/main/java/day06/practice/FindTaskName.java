package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTaskName {

	public  boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.getTaskName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

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

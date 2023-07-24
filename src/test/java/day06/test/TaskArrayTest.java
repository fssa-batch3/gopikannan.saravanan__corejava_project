package day06.test;

import java.util.ArrayList;

import day06.practice.Task;

public class TaskArrayTest {
	public static void main(String[] args) {
		ArrayList<Task> TaskArray = new ArrayList<Task>();
		Task task1 = new Task("Wake up early",1);
		TaskArray.add(task1);
		Task task2 = new Task("Have a Bath",2);
		TaskArray.add(task2);
		Task task3 = new Task("Get ready for Office",3);
		TaskArray.add(task3);
		Task task4 = new Task("Do the office work",4);
		TaskArray.add(task4);
		

		for (Task task : TaskArray) {
			System.out.println("Taskname : "+" "+task.getTaskName()+","+"Priority : "+" "+task.getPriority());
		}

		
		
		
	}

}

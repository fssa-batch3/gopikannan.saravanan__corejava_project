package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class TaskArray {
	public static void main(String[] args) {
		ArrayList<Task> TaskArray = new ArrayList<Task>();
		Task task1 = new Task(1,"Wake up early","Done");
		TaskArray.add(task1);
		Task task2 = new Task(2,"Have a Bath","Done");
		TaskArray.add(task2);
		Task task3 = new Task(3,"Get ready for Office","Done");
		TaskArray.add(task3);
		Task task4 = new Task(4,"Check Calendar","Pending");
		TaskArray.add(task4);
		

		for (Task task : TaskArray) {
			System.out.println("Taskname : "+" "+task.getTaskName()+","+"Priority : "+" "+task.getId());
		}

		
		
		
	}
}

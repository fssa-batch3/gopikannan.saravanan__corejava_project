package day12.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day12.practice.DAOException;
import day12.practice.TaskDAO;

public class TaskTest {
	@Test
	void test() {
		TaskDAO taskDAO = new TaskDAO();

		Task task1 = new Task(2, "Conference", "Pending");
		Task task2 = new Task(3, "Task meet", "Completed");

		try {

			taskDAO.createTask(task1);
			taskDAO.createTask(task2);

			task1.setStatus("In Progress");
			taskDAO.updateTask(task1);

			int taskIdToDelete = 2;
			taskDAO.deleteTask(taskIdToDelete);

			List<Task> tasks = taskDAO.getAllTasks();

			for (Task task : tasks) {
				System.out.println(task);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}
}

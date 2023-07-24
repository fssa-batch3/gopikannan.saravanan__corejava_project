package day11.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskLIstTest {

	@Test
	public void testCreateTask() throws SQLException, DAOException {
		
		Task newTask = new Task(1, "CheckCalendar", "Finished");

		
		Taskdaoexception taskDAO = new Taskdaoexception();
		

		try {
			
			taskDAO.createTask(newTask);

			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasklist WHERE id = ?");
			statement.setInt(1, newTask.getId());
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				
				Assertions.assertEquals(newTask.getName(), resultSet.getString("taskname"));
				Assertions.assertEquals(newTask.getStatus(), resultSet.getString("taskstatus"));
			} else {
				
				Assertions.fail("Task data not found in the database");
			}

			resultSet.close();
			statement.close();
			connection.close();
		} catch (DAOException e) {
			Assertions.fail("Task creation failed: " + e.getMessage());
		}
	}
}

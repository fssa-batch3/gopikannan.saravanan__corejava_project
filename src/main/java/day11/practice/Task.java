package day11.practice;

import java.sql.SQLException;

public class Task {
	private int id;
	private String name;
	private String status;

	public Task(int id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public static void main(String []args) {
		
		Task newtask = new Task(1,"CheckCalendar","Finished");
		
		Taskdaoexception newdao = new Taskdaoexception();
		 
		try {
			
			newdao.createTask(newtask);
		}
		catch(DAOException |SQLException e) {
			e.printStackTrace();
			
		}
		
		
	}
}

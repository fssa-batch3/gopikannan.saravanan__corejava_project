package day07.practice;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
	private String taskName;
	private int id;
	private LocalDate deadline;

	public Task(String taskName, int id, LocalDate deadline) {
		this.taskName = taskName;
		this.id = id;
		this.deadline = deadline;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return taskName.equals(other.taskName) && Objects.equals(deadline, other.deadline);
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskName, deadline);
	}
}

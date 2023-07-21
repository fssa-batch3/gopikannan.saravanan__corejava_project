package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskList implements Comparable<TaskList> {
	private int id;
	private String name;
	private LocalDate deadline;

	public TaskList(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public int compareTo(TaskList other) {

//        int idComparison = Integer.compare(this.id, other.id);
//        
//       
//        if (idComparison != 0) {
//            return idComparison;
//        }
//        

		int monthComparison = Integer.compare(this.deadline.getMonthValue(), other.deadline.getMonthValue());

		
		if (monthComparison != 0) {
			return monthComparison;
		}

		
		return Integer.compare(this.deadline.getDayOfMonth(), other.deadline.getDayOfMonth());
	}

	@Override
	public String toString() {
		return id + "," + name + "," + deadline;
	}
}
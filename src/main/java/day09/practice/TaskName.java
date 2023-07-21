package day09.practice;


import java.time.LocalDate;
import java.util.*;
public class TaskName {
    public static void main(String[] args) {

    	ArrayList<TaskList> taskList = new ArrayList<>();

        taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-22")));
        taskList.add(new TaskList(5, "Product Design", LocalDate.parse("2022-10-01")));
        taskList.add(new TaskList(1, "Software Design", LocalDate.parse("2022-10-07")));
        taskList.add(new TaskList(3, "Coding", LocalDate.parse("2022-10-22")));

        System.out.println("Before Sort:");
        for (TaskList task : taskList) {
            System.out.println(task);
        }

        Collections.sort(taskList);

        System.out.println("\nAfter Sort:");
        for (TaskList task : taskList) {
            System.out.println(task);
        }
    }
}

package day08.test;

import java.util.Scanner;

import day08.practice.ListOfEmployees;

public class ListOfEmpolyees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma separated list of DeptName, EmployeeName");
		String str = scan.nextLine();
		scan.close();

		ListOfEmployees names = new ListOfEmployees();

		System.out.println("The list of employees");

		System.out.println(names.list(str));

	}

}

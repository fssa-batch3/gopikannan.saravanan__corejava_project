package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int length = scanner.nextInt();

       
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            num.add(value);
        }

        scanner.close();

        System.out.println("Before Sort: " + num);
        Collections.sort(num);
        System.out.println("After Sort: " + num);
    }
}

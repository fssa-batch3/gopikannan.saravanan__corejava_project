package weeklyAssesment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DepartmentEmployeeSorting {

	static String getDepartmentEmployeeSorted(List<String> inputLines) {
		// Validation
		StringBuilder output = new StringBuilder("");
		Map<String, TreeSet<String>> dept = new TreeMap<>();
		if (inputLines == null) {
			return "";
		} else {
			for (String sourceLine : inputLines) {
				String[] keyValuePair = sourceLine.split(",");
				if (dept.containsKey(keyValuePair[0])) {
					Set<String> empNameSet = dept.get(keyValuePair[0]);
					empNameSet.add(keyValuePair[1]);
				} else {
					TreeSet<String> empNameSet = new TreeSet<>();
					empNameSet.add(keyValuePair[1]);
					dept.put(keyValuePair[0], empNameSet);
				}
			}
		}

		Set<String> deptKeySet = dept.keySet();
		for (String department : deptKeySet) {
			output.append(department);
			output.append(":");
			output.append(dept.get(department));
			output.append("\n");
		}
		return output.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfLines = sc.nextInt();
		sc.nextLine();
		List<String> inputLines = new ArrayList<>(numOfLines);

		for (int i = 0; i < numOfLines; i++) {
			inputLines.add(sc.nextLine());
		}

		sc.close();
		System.out.println(getDepartmentEmployeeSorted(inputLines));
	}
}

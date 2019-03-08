package org.learn.selectionsort;

import java.util.Arrays;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee[] { new Employee(1007, "Mark"),
				new Employee(1010, "Luke"), new Employee(1001, "Jonathon") });

		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < employees.size(); j++) {
				/*
				 * if( employees[j].getId() < employees[minIndex].getId()){
				 * minIndex = j; }
				 */

				if (employees.get(j).getName().compareTo(employees.get(minIndex).getName()) < 0) {
					minIndex = j;
				}

				Employee temp = employees.get(minIndex);
				employees.set(minIndex, employees.get(i));
				employees.set(i, temp);
			}

		}

		/*
		 * for(int i = 0; i<employees.size(); i++){
		 * System.out.println(employees.get(i)); }
		 */
		System.out.println(employees);
	}
}

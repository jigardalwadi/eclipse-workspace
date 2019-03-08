package org.learn.selectionsort;

public class Application {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1005, "John"), new Employee(1007, "Mark"), new Employee(1010, "Luke"),
				new Employee(1001, "Jonathon") };

		for (int i = 0; i < employees.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < employees.length; j++) {
				/*
				 * if( employees[j].getId() < employees[minIndex].getId()){
				 * minIndex = j; }
				 */

				if (employees[j].getName().compareTo(employees[minIndex].getName()) < 0) {
					minIndex = j;
				}

				Employee temp = employees[minIndex];
				employees[minIndex] = employees[i];
				employees[i] = temp;
			}

		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}

package org.learn.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApplication {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(new Integer[]{10, 1, 15, 2, 3, 4, 5});
		System.out.println(integers);
		System.out.println("after sorting");
		Collections.sort(integers);
		System.out.println(integers);

	}

}

package com.bl;

public class MaxValue {

	public <T extends Comparable<T>> T findMax(T value1, T value2, T value3) {
		T max = value1;
		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		System.out.println("Maximum value is " + max);
		return max;
	}
}

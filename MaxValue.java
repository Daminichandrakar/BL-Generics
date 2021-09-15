package com.bl;

public class MaxValue<T extends Comparable<T>> {
	T[] values;

	public MaxValue(T[] values) {
		this.values = values;
	}

	public static <T extends Comparable<T>> T testMaximum(T... values) {
		T max = values[0];
		for (T t : values) {
			if (t.compareTo(max) > 0)
				max = t;
		}
		System.out.println("Maximum value is " + max);
		return max;
	}

	public T findMax() {
		return MaxValue.testMaximum(values);
	}
}

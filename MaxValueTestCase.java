package com.bl;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxValueTestCase {
	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtFirstPosition() {
		Integer[] arr = { 9, 3, 2, 4, 5, 2 };
		int value = new MaxValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtSecondPosition() {
		Integer[] arr = { 3, 9, 2, 4, 5, 2 };
		int value = new MaxValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenIntegerNumber_ShouldReturnMaxAtThirdPosition() {
		Integer[] arr = { 3, 2, 9, 5, 2 };
		int value = new MaxValue<Integer>(arr).findMax();
		Assert.assertEquals(9, value);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxAtFirstPosition() {
		Float[] arr = { 9.0f, 5.0f, 6.0f };
		float value = new MaxValue<Float>(arr).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxSecoundPosition() {
		Float[] arr = { 5.0f, 9.0f, 6.0f };
		float value = new MaxValue<Float>(arr).findMax();
		Assert.assertEquals(9.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenFloatNumber_ShouldReturnMaxThirdPosition() {
		Float[] arr = { 9.0f, 5.0f, 11.0f };
		float value = new MaxValue<Float>(arr).findMax();
		Assert.assertEquals(11.0f, value, 0.0f);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtFirstPosition() {
		String[] arr = { "peach", "apple", "banana" };
		String value = new MaxValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtSecoundPosition() {
		String[] arr = { "apple", "peach", "banana" };
		String value = new MaxValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}

	@Test
	public void givenThreeNumber_WhenStringValue_ShouldReturnMaxAtThirdPosition() {
		String[] arr = { "apple", "banana", "peach" };
		String value = new MaxValue<String>(arr).findMax();
		Assert.assertEquals("peach", value);
	}
}

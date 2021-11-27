package com.raaga.kolte.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAppTest {
	@Test
	public void loginTest1() {
		MyApp a = new MyApp();
		Assert.assertEquals(0, a.userLogin("karthik1", "abcd1234"));
	}
	@Test
	public void loginTest2() {
		MyApp a = new MyApp();
		Assert.assertEquals(1, a.userLogin("karthik", "abcd1234"));
	}
}

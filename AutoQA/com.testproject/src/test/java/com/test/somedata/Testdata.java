package com.test.somedata;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


import static org.junit.Assert.assertTrue;


public class Testdata {
	
	@Test
	public void testCompareData() {
		String str1 = "test";
		String str2 = "testööó";
		assertEquals("Should be equal", str1, str2);
	}
	
	@Test
	public void testShouldbeTrue() {
		boolean test=true;
		assertTrue("Should be True",test);
	}
	


	

}

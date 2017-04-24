package com.example.tests;
import org.junit.Test;

import com.example.fv.GroupData;

public class AddEmptyGroup extends myTestBase {
	@Test
	public void testAddNewEmptyGroup() throws Exception {
		
		GroupData group = new GroupData("", "", "");
		app.createGroup(group);
	}

}

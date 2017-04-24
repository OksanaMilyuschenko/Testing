package com.example.tests;
import org.junit.Test;

import com.example.fv.GroupData;
;

public class AddNewGroup extends myTestBase{
	@Test
	public void testAddNewGroup() throws Exception {
		GroupData group = new GroupData("test", "test", "test");
		app.createGroup(group);
	}

	
}

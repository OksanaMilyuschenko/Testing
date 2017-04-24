package com.example.tests;

import org.junit.After;
import org.junit.Before;
import com.example.fv.AppManager;

public class myTestBase {

	protected AppManager app;

	@Before
	public void setUp() throws Exception {
		app = AppManager.getInstance(); 
	}

	@After
	public void tearDown() throws Exception {
		app.stop();
	}


}

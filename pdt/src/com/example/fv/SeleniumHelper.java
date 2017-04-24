package com.example.fv;

import com.thoughtworks.selenium.Selenium;

public class SeleniumHelper {

	 private Selenium selenium;

	
	public SeleniumHelper(){
		selenium = new DefaultSelenium("localhost", 4444,) 	}


	public void dismiss() {
		selenium.stop();
	
	}
	
	public Selenium getSelenium(){
		
		return selenium;
	}
}

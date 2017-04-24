package com.example.fv;

import com.thoughtworks.selenium.Selenium;

public class NavHelper {
	
	private Selenium selenium;
	private AppManager app;

	public NavHelper(AppManager app){
		this.app = app;
		selenium = app.getSeleniumHelper().getSelenium();
	}
	private void login() {
		selenium.type("name=user", "admin");
		selenium.type("name=pass", "secret");
	}

	private void openMainPage() {
		selenium.open("/addressbook/group.php");
	}

}

package com.example.fv;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class AppManager {
	
	private static final String SeleniumHelper = null;

	
	private static AppManager app;
	
	private SeleniumHelper seleniumHelper;

	private SeleniumHelper selenium;
	private NavHelper navHelper;
	
	public static AppManager getInstance(){
		if (app==null){
			app = new AppManager();
			app.init();	
		}
		return app;
	}
    public SeleniumHelper getSeleniumHelper(){
    	if (SeleniumHelper ==null){
    		seleniumHelper = new SeleniumHelper();
    		selenium = (com.example.fv.SeleniumHelper) seleniumHelper.getSelenium();
    	}
    	return seleniumHelper;
    }
    
    public NavHelper getnavHelper(){
    	if (navHelper ==null){
    		navHelper = new NavHelper(this);
    	}
    	return navHelper;
    }
    
    public void dismiss(){
    	if (seleniumHelper !=null){
    	seleniumHelper.dismiss();
    	}
    }
   
	public void createGroup(GroupData group) {
		openMainPage();
		login();
		initGroupCreation();
		fillGroupForms(group);
		submitGroupForm();
	}

	private void submitGroupForm() {
		clickAndWait("name=submit");
	}

	private void fillGroupForms(GroupData group) {
		selenium.type("name=group_name", group.name);
		selenium.type("name=group_header", group.header);
		selenium.type("name=group_footer", group.footer);
	}

	private void initGroupCreation() {
		clickAndWait("css=input[type=\"submit\"]");
		clickAndWait("name=new");
	}

	
	private void clickAndWait(String locator) {
		selenium.click(locator);
		selenium.waitForPageToLoad("30000");
	}

	private void verifyEquals(String string, String text) {
		// TODO Auto-generated method stub
		
	}
}	

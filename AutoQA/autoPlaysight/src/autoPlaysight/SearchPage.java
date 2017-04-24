package autoPlaysight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
 private  WebDriver driver;
 public SearchPage(WebDriver driver) {
 this.driver = driver;
 }
 
 By search = By.cssSelector("div.searchForm > form input");

 
 
     public SearchPage typeSearchInput (String text){
     driver.findElement(search).sendKeys(text);
	 
		return this;
		 
	 }
    
	 
	

}

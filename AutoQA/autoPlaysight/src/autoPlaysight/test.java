package autoPlaysight;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {



	public static void main(String[] args) throws IOException {
		
		   
	    
		System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium-2.53.1/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("http://google.com/");
		  Actions action = new Actions(driver);
	      action.sendKeys(Keys.CONTROL + "TAB");
		  String text1 = driver.findElement(By.cssSelector("body")).getText();
		  System.out.println(text1);

	}

}

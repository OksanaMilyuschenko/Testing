package autoPlaysight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusketPage {
	
	 By minusButton = By.cssSelector("div.counter.clearfix > div.minus"); 
	 By plusButton = By.cssSelector("div.counter.clearfix > div.plus");
	 By deleteButton = By.cssSelector(" #cartprods > div.cartProductsList > div:nth-child(1) > div.cartTools.clearfix > div.del");
	 By productList = By.cssSelector("#cartprods > div.cartProductsList");
	 By order = By.cssSelector(" #cartprods > div.submit.clearfix > button");
	 
	 
	 public WebDriver driver;
		
	 public BusketPage(WebDriver driver) {
	 this.driver = driver;
	 }
	 
	 public BusketPage addOrder(){
		 
		 driver.findElement(plusButton).click();	
		 return this; 	 
	 }
	 
    public BusketPage minusOrder(){
		 
		 driver.findElement(minusButton).click();	
		 return this; 	 
	 }	
    public BusketPage deleteOrder(){
		 
		 driver.findElement(deleteButton).click();	
		 return this; 	 
	 }	
    public BusketPage clickOrder(){
		 
		 driver.findElement(order).click();	
		 return this; 	 
	 }	
	
    public int getAmount(){
		 
		List <WebElement> elements =  driver.findElements(order);
		int amount= elements.size();
		System.out.println(amount);
		return  amount; 
		
	 }	
	
   
	
}


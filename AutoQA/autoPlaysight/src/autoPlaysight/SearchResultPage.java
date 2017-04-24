package autoPlaysight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	
	public WebDriver driver;
		
	 public SearchResultPage(WebDriver driver) {
	 this.driver = driver;
	 }
	
	 By productsList = By.cssSelector("div.search_container > div > div.products_list div[data-id]"); 
		
	 public WebElement getElementIndex(int index){
	     List <WebElement> list=driver.findElements(productsList);
	     int size = list.size();
	     if (index>size) {
	         throw new IllegalStateException("There are no such product.Try to enter number from 0 to" + size);
	     }
	      WebElement element = list.get(index);
			 
			return element;
		 }

		 
	     public SearchResultPage openItemByIndex(int index){
	     List <WebElement> list=driver.findElements(productsList);	
	     list.get(index).click();
	    	
		 return this;
	    	
	    }
}

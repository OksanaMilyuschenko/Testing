package autoPlaysight;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class MainTest  {
	
	


	@Test
	public void startWebDriver() {
		 
		  
		  
		System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium-2.53.1/chromedriver.exe"); 
	       WebDriver driver = new ChromeDriver();
	  driver.get("http://musthave.ua/search?search=%D0%BF%D0%BB%D0%B0%D1%82%D1%8C%D0%B5");
	       
//	       ProductPage product = new ProductPage(driver);
//	       product.changeSize(40);
//	 
	       SearchResultPage test1 = new SearchResultPage(driver);
	       test1.getElementIndex(0);
	       test1.openItemByIndex(0);
	       ProductPage test2 = new ProductPage(driver);
	       test2.submit();
	
	       BusketPage test = new BusketPage(driver);
	       test.getAmount();
	    

	   }



}











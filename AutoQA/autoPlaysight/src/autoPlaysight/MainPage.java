package autoPlaysight;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MainPage {
		
	    By searchField = By.cssSelector("#h > div > div.tools > div.tool.search > span");
	    By cabinet   = By.cssSelector("#h > div > div.tools > div.tool.auth > span");
	    By basket   = By.cssSelector("#h > div > div.tools > div.tool.cart > span");
	    By catalog   = By.cssSelector("#h > div > div.tools > div.tool.menu > span");
	    By contacts  = By.cssSelector("#h > div > div.tools > div.tool.contacts > a");
	    By certificate  = By.cssSelector("#h > div > div.collection > a");
	    By languageSwitcher  = By.cssSelector("#h > div > div.language-switcher");

        private By closeButton = By.cssSelector("body > div.freeShipping > div > div");

   public void closePopup() {
   driver.findElement(closeButton).click();
         }  
	    
	   
	private  WebDriver driver;

	public MainPage(WebDriver driver) {
	this.driver = driver;

//	if (!"Стильные платья, купить платье украинских брендов, красивые платья заказать через интернет, модные платья - цена в интернет-магазине MustHave".equals(driver.getTitle())) {
//	            throw new IllegalStateException("This is not this site");
//	        }
	    }
	public void openSearch(){
	       driver.findElement(searchField).click();	
	 }
	 public void  openCabinet(){
	       driver.findElement(cabinet).click();
	 }
	 public void openCart(){
	       driver.findElement(basket).click();	
	 }
	 public void openCatalog(){
	       driver.findElement(catalog).click();	
	 }
	 public void openContacts(){
	      driver.findElement(contacts).click();	
	 }
	 public void openCetificates(){
	      driver.findElement(certificate).click();	
	}

	 public MainPage languageSwitching( String language){
		 
		 List <WebElement> result=driver.findElements(languageSwitcher);
		 if (language == "RU"){
			result.get(0).click();
		 }else if (language == "EN"){
	        result.get(1).click();
	     }else{
	        result.get(2).click();
	     }	  
		return this;
		 
	 }
	    
	 }





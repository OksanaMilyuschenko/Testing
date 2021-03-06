package autoPlaysight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SignInTest {
	private String username;
	private String password;
	
	 @Parameters
	    public static Collection<Object[]> testData() {
	        return Arrays.asList(
	            new Object[][] {
	                {"user1", "!@#@$^$@##$%"},
	                {"user2", "123123ab"},
	                {"user3", "sg2345"},
	        }
	    );
	 }
	
	 public SignInTest(String username, String password) {
		this.username = username;
		this.password = password;
	 }
	
	@Test
	public void testSignInBehaviour() {
		System.setProperty("webdriver.chrome.driver","C:/Program Files/selenium-2.53.1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.duolingo.com");
		driver.findElement(By.cssSelector("#sign-in-btn")).click();
		driver.findElement(By.cssSelector("#top_login")).sendKeys(this.username);
		driver.findElement(By.cssSelector("#top_password")).sendKeys(this.password);
		driver.findElement(By.cssSelector("#login-button")).click();
		
		String errorMessage = driver.findElement(By.cssSelector("#message")).getText();
		
		assertEquals(errorMessage, "Wrong username or password");
	}
}
package testNGprograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertions {
	
	public WebDriver driver;
  @Test
  public void verifyingTheUrlWhenPageLoaded() {
	  String actualUrl=driver.getCurrentUrl();
	  String expectedUrl="https://selenium.qabible.in/";
	  //Hard assert
	 
	  Assert.assertEquals(actualUrl, expectedUrl,"The case is failed,URL DOES NOT MATCHING");
	  
  }
  
  
  @Test
  public void verifyingTheUrlWhenPageLoadedSoftAssert() {
	  String actualUrl=driver.getCurrentUrl();
	  String expectedUrl="https://selenium.qabible.in1/";
	  //Hard assert
	SoftAssert soft=new SoftAssert();
			  soft.assertEquals(actualUrl, expectedUrl,"The case is failed,URL DOES NOT MATCHING");
			  soft.assertAll();
		 System.out.println("testing the exception breakage in Hard assertion");

  }
  
  
  
  @Test
  public void checkingifMessageisDisplayed() {
	  
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.findElement(By.id("single-input-field")).sendKeys("Assertions");
	  driver.findElement(By.id("button-one")).click();
	 String actualMessage= driver.findElement(By.id("message-one")).getText();
	 Assert.assertEquals(actualMessage, "Assertions");
	 //OR
	 //Assert.assertTrue(actualMessage.contains("Assertions"));
	 
	 System.out.println("testing the exception breakage in Hard assertion");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

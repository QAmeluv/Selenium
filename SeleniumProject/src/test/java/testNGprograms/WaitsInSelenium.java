package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WaitsInSelenium {
	
	public WebDriver driver;
  @Test
  public void verifyExplicitWait() {
	  WebElement inputMessage=driver.findElement(By.id("single-input-field"));
	  //explicit wait- should be done before any action on the element.
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.elementToBeClickable(inputMessage));
	  
	  //wait.until(ExpectedConditions.elementToBeSelected(inputMessage))
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("single-input-field")));
  }
  
  
  @Test
  public void verifyFluentWait() {
	  WebElement inputMessage=driver.findElement(By.id("single-input-field"));
	  Wait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(inputMessage));
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("http://selenium.qabible.in/simple-form-demo.php");
	  driver.manage().window().maximize();
	  //implicit wait applicable for all the lements
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterTest
  public void afterTest() {
  }

}

package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ToolTip {
	public WebDriver driver;
	public Actions action;
  @Test
  public void verifyingTooTipforLiveElement() throws InterruptedException {
	  WebElement liveElement=driver.findElement(By.xpath("(//a[@title='Live'])[3]"));
	  String expectedTooltip="Live";
	  action=new Actions(driver);
	  Thread.sleep(1000);
	  action.moveToElement(liveElement).perform();
	 String actualTooltip= liveElement.getAttribute("title");
	 Assert.assertEquals(actualTooltip, expectedTooltip,"The tooltip is different");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.browserstack.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

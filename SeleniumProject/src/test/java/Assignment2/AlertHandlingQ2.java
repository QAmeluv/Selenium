package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertHandlingQ2 {
	
	public WebDriver driver;
  @Test
  public void verifyAlertHandling() throws InterruptedException {
	  driver.findElement(By.id("alertBox")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(100);
	  driver.findElement(By.id("confirmBox")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(100);
	  driver.findElement(By.id("promptBox")).click();
	  Thread.sleep(1000);
	  Alert alert=driver.switchTo().alert();
	  alert.sendKeys("Reshma");
	  alert.accept();
	  System.out.println(driver.findElement(By.id("output")).getText());
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html?m=1");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

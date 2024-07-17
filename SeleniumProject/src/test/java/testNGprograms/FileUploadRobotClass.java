package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileUploadRobotClass {
	public WebDriver driver;

	@Test
  public void verifyFileUpload() throws AWTException, InterruptedException {
		
		
	 WebElement choosefile= driver.findElement(By.id("file-upload"));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", choosefile);
//	 choosefile.click();
	 Thread.sleep(1000);
	 
	 //create Robot object
	 
	 Robot rb=new Robot();
	 
	 
	 // Store the File path to the StringSelection class
		StringSelection filePath = new StringSelection("/Users/reshmabibin/Downloads/Assignment 4_7_2024 (2).pdf");
		//Copy above path to clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				// press Contol+V for pasting
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.delay(12);
				rb.keyPress(KeyEvent.VK_V);
				
				// release Contol+V for pasting
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.delay(12);
				rb.keyRelease(KeyEvent.VK_V);
				
				// for pressing and releasing Enter
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.delay(12);
				rb.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(2000);
				System.out.println("file uploaded..");
	  
  }
	
	
	@Test
	public void fileUploadSendKeys() {
		 WebElement choosefile= driver.findElement(By.id("file-upload"));
		 choosefile.sendKeys("/Users/reshmabibin/Downloads/Assignment 4_7_2024 (2).pdf");
		 System.out.println("file uploaded..");
		 driver.findElement(By.id("file-submit")).click();
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
	}

}

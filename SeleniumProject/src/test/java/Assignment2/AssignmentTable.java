package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssignmentTable {
	public WebDriver driver;
  @Test
  public void readValueaFromTable() {
	 List<WebElement> elements= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[1]"));
	 for(WebElement ele:elements) {
		 System.out.println(ele.getText());
	 }
	 
	 List<WebElement> values= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]"));
	 for(WebElement val:values) {
		 System.out.println(val.getText());
	 }
  
  }
  @BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}

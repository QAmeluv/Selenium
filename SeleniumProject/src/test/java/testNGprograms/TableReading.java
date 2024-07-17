package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TableReading {
	
	public WebDriver driver;
  @Test
  public void verifyNoOfRowsAndColoums() {
	  List<WebElement> listRows=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	  List<WebElement> listColums=driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
	  System.out.println("Row size is "+ listRows.size());
	  System.out.println("Column size is "+ listColums.size());
	  
  }
  
  @Test
  public void findValuefromFirstRowFirstCOlum() {
	  System.out.println("First Value is  "+driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td[1]")).getText());
	  
  }
  
  @Test
  public void toGetParticularValue() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/web-table-element.php");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

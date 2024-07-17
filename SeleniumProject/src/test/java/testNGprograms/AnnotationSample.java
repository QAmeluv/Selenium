package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationSample {
	
	public WebDriver driver;
  @Test
  public void verifyIfDropdownIsMultiSelect() {
		WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select colors=new Select(selectColor);
		Boolean isMultiple=colors.isMultiple();
		System.out.println(isMultiple);

  }
  @Test
  public void verifyToSelectValueFromDropdown() {
	  WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select colors=new Select(selectColor);
		colors.selectByIndex(1);
		WebElement element=colors.getFirstSelectedOption();
		System.out.println(element.getText());
		
  }
  
  @Test
  public void verifyAllOptionsInDropDown(){
	  WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select colors=new Select(selectColor);
		List<WebElement>options=colors.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
	  
  }
  
  @Test
  public void verifyIfSecondDropdownIsMulti() {

		WebElement multiDrop=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1=new Select(multiDrop);
		System.out.println("Is multiple: "+select1.isMultiple());
  }
  
  @Test
  public void verifyToSelectAndDeselectAllValuesFromDp() {
	  WebElement multiDrop=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1=new Select(multiDrop);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		List<WebElement> allSelected= select1.getAllSelectedOptions();
		
		
		for(WebElement element2:allSelected) {
			System.out.println(element2.getText());
			
		}
		select1.deselectAll();
		System.out.println("Deselect All values");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver(); 
	  
	  driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Dropdown Handling");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Dropdown Handling- After Suite"); 
  }

}

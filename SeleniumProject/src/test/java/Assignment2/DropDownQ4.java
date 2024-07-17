package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDownQ4 {

	public WebDriver driver;

	@Test
	public void verifydropDown() {
		// display all options in the course dropdown
		WebElement courses = driver.findElement(By.id("course"));
		Select select = new Select(courses);
		List<WebElement> list = select.getOptions();
		for (WebElement element : list) {
			System.out.println(element.getText());
		}

		// select a course
		select.selectByIndex(1);
		System.out.println(select.getFirstSelectedOption().getText());
		// display the no of drop down
		List<WebElement> dropDown = driver.findElements(By.tagName("select"));
		System.out.println("The number of drop downs are " + dropDown.size());

		WebElement ideElement = driver.findElement(By.id("ide"));
		Select select1 = new Select(ideElement);
		System.out.println("is  IDE multi select: " + select1.isMultiple());
		select1.selectByValue("ec");
		select1.selectByValue("ij");
		select1.selectByValue("nb");

		List<WebElement> selctedList = select1.getAllSelectedOptions();
		for (WebElement ide : selctedList) {
			System.out.println(ide.getText());
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

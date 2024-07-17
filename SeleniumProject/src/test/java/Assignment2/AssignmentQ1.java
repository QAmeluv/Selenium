package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssignmentQ1 {

	public WebDriver driver;

	@Test
	public void verifyingFormSubmit() {
		driver.findElement(By.xpath("//a[contains(text(),'Input Form')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Form Submit')]")).click();
		driver.findElement(By.id("validationCustom01")).sendKeys("Reshma");
		driver.findElement(By.id("validationCustom02")).sendKeys("Moncy");
		driver.findElement(By.id("validationCustomUsername")).sendKeys("resh");
		driver.findElement(By.id("validationCustom03")).sendKeys("Alleppey");
		driver.findElement(By.id("validationCustom04")).sendKeys("kerala");
		driver.findElement(By.id("validationCustom05")).sendKeys("1234");
		driver.findElement(By.id("invalidCheck")).click();
		driver.findElement(By.xpath("//button[text()='Submit form']")).click();
		System.out.println(driver.findElement(By.id("message-one")).getText());

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

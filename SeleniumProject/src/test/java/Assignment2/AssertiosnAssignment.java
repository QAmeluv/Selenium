package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AssertiosnAssignment {

	public WebDriver driver;

	@Test
	public void verify_Rememberme_CheckBox_Ischecked_Bydefault() {
		// Assert.assertFalse(driver.findElement(By.xpath("//label[@for='remember']")).isSelected());

		// or
		Assert.assertTrue(!(driver.findElement(By.xpath("//label[@for='remember']")).isSelected()));

	}

	@Test
	public void verify_Successful_Login() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actualUsername = driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).getText();

		String expectedUsername = "Admin";
		Assert.assertEquals(actualUsername, expectedUsername);
	}

	@Test
	public void verify_Unsuccessfull_Login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin175");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//i[@class='icon fas fa-ban']")).isDisplayed());
	}

	@Test
	public void verify_Unsuccessfull_Login_usingUrl() {
		String expectedUrl = "https://groceryapp.uniqassosiates.com/admin";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("159753");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(actualUrl, expectedUrl);

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");

	}

}

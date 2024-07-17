package Assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class FileUploadAssignment {
	public WebDriver driver;
	public WebDriverWait wait;
	private String uname = "reshma.moncy42@gmail.com", password = "Reshma_Github1";
//
//	@Test
//	public void changeProfilePicture() throws InterruptedException {
//		driver.findElement(By.id("login_field")).sendKeys(uname);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.name("commit")).click();
//		driver.findElement(By.xpath("(//div[starts-with(@class,'position-absolute')])[2]")).click();
//		driver.findElement(By.xpath("//label[@role='menuitem']"))
//				.sendKeys("/Users/reshmabibin/Downloads/freestocks-I_pOqP6kCOI-unsplash.jpg");
//		System.out.println("File uploaded");
//	}

	@Test
	public void changeProfilePictureRobot() throws AWTException, InterruptedException {
		driver.findElement(By.id("login_field")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("(//div[starts-with(@class,'position-absolute')])[2]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//details-menu[@class='dropdown-menu dropdown-menu-se']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@role='menuitem']"))).click();
		driver.findElement(By.xpath("//label[@role='menuitem']")).click();
		 System.out.println("Done waiting5");
		Robot rb = new Robot();
		 System.out.println("Done waiting6");

		StringSelection filePath = new StringSelection(
				"/Users/reshmabibin/workout.jpg");
		 System.out.println("Done waiting7");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		 System.out.println("Done waiting8");

	
		 // Press Cmd+Shift+G to open the "Go to the folder" dialog
        rb.keyPress(KeyEvent.VK_META);
        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_G);
        System.out.println("Done waiting4");
        rb.delay(200);  // Ensure all keys are pressed
        rb.keyRelease(KeyEvent.VK_G);
        rb.keyRelease(KeyEvent.VK_SHIFT);
        rb.keyRelease(KeyEvent.VK_META);
        System.out.println("Done waiting3");

        // Add a small delay
        rb.delay(1000);

        // Paste the file path
        rb.keyPress(KeyEvent.VK_META);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(200);  // Ensure paste action is registered
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_META);
        System.out.println("Done waiting2");

        // Add a small delay
        rb.delay(1000);

        // Press Enter to navigate to the file path
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.delay(200);  // Ensure Enter action is registered
        rb.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("Done waiting1");

        // Add a small delay
        rb.delay(1000);

        // Press Enter to select the file
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.delay(200);  // Ensure Enter action is registered
        rb.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("Done waiting");

        // Add a delay to allow the file to be uploaded
        Thread.sleep(3000);
     
     WebElement detailsDialog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("details-dialog")));
System.out.println("DOne");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://github.com/settings/profile");
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void afterTest() {
		

	}

}

////

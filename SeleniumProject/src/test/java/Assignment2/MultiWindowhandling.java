package Assignment2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowhandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();

		String parentid = driver.getWindowHandle();

		Set<String> allwindowid = driver.getWindowHandles();

		for (String element : allwindowid) {
			if (!element.equalsIgnoreCase(parentid)) {
				driver.switchTo().window(element);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@id='alertBox']")).click();
				Alert firstalert = driver.switchTo().alert();
				System.out.println(firstalert.getText());
				firstalert.accept();

				driver.findElement(By.xpath("//button[@id='promptBox']")).click();
				Alert promptAlert = driver.switchTo().alert();
				promptAlert.sendKeys("Reshma");
				promptAlert.accept();
				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

			}

		}
		driver.switchTo().window(parentid);
		driver.quit();

	}

}

package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement yesBtn = driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println(yesBtn.isSelected());
		WebElement noBtn = driver.findElement(By.xpath("//input[@id='no']"));
		noBtn.click();
		System.out.println(noBtn.isSelected());
		driver.close();

	}

}

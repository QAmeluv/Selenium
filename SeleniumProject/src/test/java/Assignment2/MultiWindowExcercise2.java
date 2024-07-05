package Assignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowExcercise2 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement firstbtn = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", firstbtn);
		firstbtn.click();

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		Set<String> allwindowsid = driver.getWindowHandles();
		for (String id : allwindowsid) {
			if (!id.equalsIgnoreCase(parentid)) {

				driver.switchTo().window(id);

				driver.manage().window().maximize();

				if (driver.getTitle() == "XPath Practice - H Y R Tutorials") {

					WebElement name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));

					js.executeScript("arguments[0].scrollIntoView();", name);
					name.sendKeys("reshma");
					WebElement name2 = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
					js.executeScript("arguments[0].scrollIntoView();", name2);
					name.sendKeys("Moncy");
					WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
					js.executeScript("arguments[0].scrollIntoView();", email);
					email.sendKeys("xyz@gmail.com");
					WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
					js.executeScript("arguments[0].scrollIntoView();", pwd);
					pwd.sendKeys("pwd");
					WebElement rpwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
					js.executeScript("arguments[0].scrollIntoView();", rpwd);
					rpwd.sendKeys("pwd");

					WebElement buttonSubmit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
					js.executeScript("arguments[0].scrollIntoView();", buttonSubmit);
					buttonSubmit.click();
					driver.close();

				} else if (driver.getTitle() == "Basic Controls - H Y R Tutorials") {
					System.out.println(driver.getCurrentUrl());

					System.out.println(driver.getTitle());

					WebElement fmane = driver.findElement(By.xpath("//input[@id='firstName']"));
					js.executeScript("arguments[0].scrollIntoView();", fmane);
					fmane.sendKeys("Resh");
					WebElement lmane = driver.findElement(By.xpath("//input[@id='lastName']"));
					js.executeScript("arguments[0].scrollIntoView();", lmane);
					fmane.sendKeys("Mon");
					WebElement gender = driver.findElement(By.xpath("//input[@id='femalerb']"));
					js.executeScript("arguments[0].scrollIntoView();", gender);
					js.executeScript("arguments[0].click();", gender);
//				gender.click();

					WebElement endcl = driver.findElement(By.xpath("//input[@id='englishchbx']"));
					js.executeScript("arguments[0].scrollIntoView();", endcl);
					endcl.click();
					WebElement chicl = driver.findElement(By.xpath("//input[@id='chinesechbx']"));
					js.executeScript("arguments[0].scrollIntoView();", chicl);
					chicl.click();
					WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
					js.executeScript("arguments[0].scrollIntoView();", email);
					fmane.sendKeys("xyz@gmail.com");
					WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
					js.executeScript("arguments[0].scrollIntoView();", password);
					password.sendKeys("paswrd");
					WebElement button2 = driver.findElement(By.xpath("//button[@id='registerbtn']"));
					js.executeScript("arguments[0].scrollIntoView();", button2);
					button2.click();
					driver.close();

				}

			}
		}
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).isDisplayed());
		driver.quit();

	}

}

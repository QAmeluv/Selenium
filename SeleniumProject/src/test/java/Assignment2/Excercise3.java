package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise3 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		System.out.println("The size of the logo :" + logo.getSize());
		System.out.println("The location of the logo :" + logo.getLocation());
		WebElement inputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());
		driver.findElement(By.xpath("//input[@id='inlineRadio21']")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio24']")).click();
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='message-two']")).getText());
		driver.navigate().to("http://selenium.qabible.in/radio-button-demo.php");

		List<WebElement> radioGroup = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement element : radioGroup) {
			element.click();
		}
		for (WebElement element : radioGroup) {
			System.out.println(element.getAttribute("value") + " : " + element.isSelected());
		}

	}

}

package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise2 {
	static WebDriver driver;
	static final String url="https://qalegend.com/restaurant/login";

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lulla");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='hidden-xs']")).getText());
		driver.findElement(By.xpath("(//*[@class='menu-text'])[2]")).click();
		WebElement addProduct=driver.findElement(By.xpath("//button[@data-target='#Addproduct']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", addProduct);
		addProduct.click();
		driver.findElement(By.xpath("//input[@id='ProductCode']")).sendKeys("777");
		driver.findElement(By.xpath("//input[@id='ProductName']")).sendKeys("Cheese");
		WebElement price=driver.findElement(By.xpath("//input[@id='PurchasePrice']"));
		price.clear();
		price.sendKeys("250");
		driver.findElement(By.xpath("//input[@id='Price']")).sendKeys("275");
		
		WebElement submitBtn=driver.findElement(By.xpath("(//button[@class='btn btn-add'])[2]"));
		js.executeScript("arguments[0].click();", submitBtn);
		WebElement lastBtn=driver.findElement(By.xpath("//button[@onclick='updatestock()']"));
		js.executeScript("arguments[0].click();", lastBtn);
		
		
		
				
	}

}

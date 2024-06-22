package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSample {
	static WebDriver driver;
	
	//Implementing through the methods is taking a lot of time to run in browser
	
//	public void loadUrl(String url) {
//		driver=new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		this.login();
//		
//		
//	}
//	public void login() {
//		WebElement userTextBox=driver.findElement(By.name("username"));
//		userTextBox.sendKeys("Admin");
//		WebElement passwordTextBox=driver.findElement(By.name("password"));
//		passwordTextBox.sendKeys("admin123");
//		WebElement loginButon=driver.findElement(By.tagName("button"));
//		loginButon.click();
//		
//	}

	public static void main(String[] args) {
//		WebElementSample sample=new WebElementSample();
//		sample.loadUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement userTextBox=driver.findElement(By.name("username"));
		userTextBox.sendKeys("Admin");
		WebElement passwordTextBox=driver.findElement(By.name("password"));
		passwordTextBox.sendKeys("admin123");
		WebElement loginButon=driver.findElement(By.tagName("button"));
		loginButon.click();
		

	}

}

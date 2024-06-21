import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSample {
	static WebDriver  driver;

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		WebDriverManager.safaridriver().setup();
//		WebDriver driver1=new ChromeDriver();
		
		
		 driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String code=driver.getPageSource();
		System.out.println(code);
//		
//		driver.navigate().to("https://www.amazon.com/hz/mycd/digital-console/contentlist");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
		
		
		
	}

}

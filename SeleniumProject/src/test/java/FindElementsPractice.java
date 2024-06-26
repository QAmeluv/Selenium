import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice {
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		driver.navigate().to("http://selenium.qabible.in");
		List<WebElement> naviLinks=driver.findElements(By.className("nav-link"));
		for(WebElement links:naviLinks) {
			System.out.println(links.getText() +" :is displayed : "+links.isDisplayed());
		}
		
		

	}

}

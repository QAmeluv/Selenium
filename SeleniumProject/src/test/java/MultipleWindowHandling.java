import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("parent Handle"+parentWindowHandle);
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		
		Set<String> allOpenedWindowHandles=driver.getWindowHandles();
		System.out.println("Al handles"+allOpenedWindowHandles);
		
		for(String handle:allOpenedWindowHandles) {
			if(!handle.equalsIgnoreCase(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getCurrentUrl()); 
				System.out.println(driver.getTitle());
			    driver.manage().window().maximize();   
			}	
			
		}
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.quit();
		
		

	}

}

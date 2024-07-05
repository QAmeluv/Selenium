package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfFrames {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		System.out.println("The number of frames in Webpage is "+frameList.size());
	

	}

}

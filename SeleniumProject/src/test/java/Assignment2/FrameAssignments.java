package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameAssignments {
	static WebDriver driver;

	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frm1");
		WebElement dropDown=driver.findElement(By.id("selectnav1"));
		
		Select options=new Select(dropDown);
		options.selectByVisibleText("- Java");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm2");
		if(driver.findElement(By.xpath("//input[@id='firstName']")).getAttribute("placeholder").equalsIgnoreCase("Enter First Name"))
		{
			System.out.println("The hint is visible ");
		}
		else {
			System.out.println("The hint not is visible ");
		}
		
		driver.switchTo().parentFrame();
		driver.quit();

	}

}

package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyOtpSignIn {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/sign-up");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Reshma");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Moncy");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xx@gmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9178888889");
		driver.findElement(By.id("password1")).sendKeys("Test123");
		driver.findElement(By.id("password2")).sendKeys("Test123");
		driver.findElement(By.xpath("//button[@class='next_ch02']")).click();
		System.out.println("OTP is page appeared?: "+driver.findElement(By.xpath("//h2[@class='otp_h2']")).isDisplayed());
		
		

	}

}

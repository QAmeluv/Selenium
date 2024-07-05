import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickmeAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickmeAlert.click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement secondAlert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		secondAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		WebElement thrirdAlert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		thrirdAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Reshma");
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		
		
		

	}

}

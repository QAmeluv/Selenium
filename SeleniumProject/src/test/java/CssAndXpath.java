import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAndXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		System.out.println("Is logo present : "+logo.isDisplayed());// to check visibility of the element

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScrolling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		WebElement addtoCart = driver.findElement(By.xpath("//a[contains(@onclick,'614')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;// intialize JSexceutor
		js.executeScript("arguments[0].scrollIntoView();", addtoCart);// js will scroll into addTocard element
//		js.executeScript("window.scrollBy(0, 1791)");
		addtoCart.click();

		// click using js executor
//		js.executeScript("arguments[0].click();", addtoCart);

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.navigate().to("https://groceryapp.uniqassosiates.com/home");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://groceryapp.uniqassosiates.com/sign-up");
		driver.navigate().to("https://groceryapp.uniqassosiates.com/sign-up");//refresh
		driver.navigate().back();
		driver.close();
		
	

	}

}

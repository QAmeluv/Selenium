import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		WebElement inputForm=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		inputForm.click();
		driver.findElements(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		WebElement checkBoxdemo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxdemo.click();
		List<WebElement> checkboxes=driver.findElements(By.className("check-box-list"));
		for(WebElement element:checkboxes) {
			element.click();
			System.out.println(element.isSelected());
		}
		
	
		

	}

}

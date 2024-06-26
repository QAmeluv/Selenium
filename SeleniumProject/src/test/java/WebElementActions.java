import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActions  {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement textBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		String name =textBox.getAttribute("placeholder");//to get value of an attribute
		System.out.println(name);
		System.out.println(textBox.getTagName());//to get tagname
		Point p=textBox.getLocation();// to get location (x,y)
		System.out.println(p);
		
		
		textBox.sendKeys("Automation Testing");
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showButton.getCssValue("font-family"));
		showButton.click();
		System.out.println(showButton.getSize());
		
//		WebElement messageField=driver.findElement(By.xpath("//div[@id='message-one']"));
//		System.out.println("Message is "+messageField.getText());
//		
//		WebElement checkboxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
//		checkboxDemo.click();
//		WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
//		System.out.println(checkBox.isSelected());
//		checkBox.click();
//		System.out.println(checkBox.isSelected());
//		
//		checkBox.getAttribute(null);//to get value of an attribute
//		
		driver.close();
	}

}

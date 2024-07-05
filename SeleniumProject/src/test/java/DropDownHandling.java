import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		//locate element
		WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		//Select class object creation, 
		Select colors=new Select(selectColor);
		colors.selectByIndex(1); //method 1 
		
		//for select index starts from 1
		
		Thread.sleep(2000);
		//select by Value
		
		colors.selectByValue("Yellow");//method 2
		
		Thread.sleep(2000);//to stop execution
		
		colors.selectByVisibleText("Green");
		
		WebElement element=colors.getFirstSelectedOption();
		System.out.println(element.getText());
		
		List<WebElement> selectedElements=colors.getAllSelectedOptions();
		
		for(WebElement elements:selectedElements) {
			System.out.println(elements.getText());
		}
		
		List<WebElement>options=colors.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		Boolean isMultiple=colors.isMultiple();
		System.out.println(isMultiple);
		
		
		//Multiple dropdown
		
		WebElement multiDrop=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1=new Select(multiDrop);
		System.out.println("Is multiple: "+select1.isMultiple());
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.getOptions();
	
		System.out.println(select1.getFirstSelectedOption().getText());
		select1.deselectByIndex(1);
		List<WebElement> allSelected= select1.getAllSelectedOptions();
		
		
	for(WebElement element2:allSelected) {
		System.out.println(element2.getText());
		
	}
	select1.deselectAll();
	
	}
	
	

}

package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionsClass {
	
	public WebDriver driver;
	public Actions actions;
  @Test
  public void verifyDragAndDropActionsClass() {
	  
	  WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement destination=driver.findElement(By.id("amt7"));
	  actions.dragAndDrop(source, destination).perform();//only single action , so only perform is given
  }
  @Test
  
  public void verifyMouseActions() {
	  WebElement agile=driver.findElement(By.xpath("//a[text()='Agile Project']"));
	  actions.moveToElement(agile).click().perform();
	  WebElement login= driver.findElement(By.name("uid"));
	  actions.click(login).perform();
	  actions.sendKeys("admin").perform();
	  WebElement password=driver.findElement(By.name("password"));
	  actions.click(password).perform();
	  actions.sendKeys("admin").perform();
	  WebElement loginBtn=driver.findElement(By.name("btnLogin"));
	  actions.sendKeys(loginBtn, Keys.ENTER);
	  
  }
  @Test
  public void sendKeyCLick() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement input=  driver.findElement(By.id("single-input-field"));
	  actions.click(input).perform();
	  actions.sendKeys("Testing").perform();
	  WebElement button=driver.findElement(By.id("button-one"));
	  actions.sendKeys(button, Keys.ENTER).perform();
	  
  }
  
  
  @Test
  public void keyDown() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement input=  driver.findElement(By.id("single-input-field"));
	  actions.click(input).perform();
	  actions.sendKeys("Testing").perform();
	  actions.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();//clicking tab button and then clicking enter button
	  
//	  WebElement button=driver.findElement(By.id("button-one"));
//	  actions.sendKeys(button, Keys.ENTER).perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  driver.manage().window().maximize();
	  actions= new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}

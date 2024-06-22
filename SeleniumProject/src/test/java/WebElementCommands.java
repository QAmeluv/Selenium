import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	static WebDriver driver;

	public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	driver.manage().window().maximize();// to maximise the window
    WebElement usernameTestBox=driver.findElement(By.name("username"));//locate username text bo
    usernameTestBox.clear();// clear the text box
    usernameTestBox.sendKeys("admin");//type in the text box
    
    WebElement passwordTestBox=driver.findElement(By.name("password"));//locate password
    passwordTestBox.clear();// clearing the password box, optional
    passwordTestBox.sendKeys("admin");//type
    
    WebElement signinButton=driver.findElement(By.tagName("button"));//locating button
    signinButton.click();// clicking button
    
    driver.close();//closing the window
   
    
	}

}

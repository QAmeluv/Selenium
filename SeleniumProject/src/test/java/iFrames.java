import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement iFrame1=driver.findElement(By.id("frame1"));//locate frame
		driver.switchTo().frame(iFrame1);//switching to frame
		System.out.println(driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText());// peinting the Text of an element
		
		//2nd method of locating an iframe is by simply using his id
		
//		driver.switchTo().frame("frame1");//id of the iframe is frame1 and it is given here
//		
//		
//		//3rd method is to dind using index
//		
//		driver.switchTo().frame(3);

//		
		driver.switchTo().parentFrame();//1. switch to parent frame
//		
//		driver.switchTo().defaultContent()////2. switch to parent frame
		
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().parentFrame();
		
		
	}

}

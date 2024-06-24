package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		// xpath for Home
		WebElement home1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		WebElement home2 = driver.findElement(By.xpath("(//a[@href='index.php'])[1]"));
		WebElement home3 = driver.findElement(By.xpath("//a[text()='Home']"));
		WebElement home4 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[1]"));
		WebElement home5 = driver.findElement(By.xpath("(//a[contains(@href,'index')])[1]"));
		WebElement home6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav-')])[1]"));
		WebElement home7 = driver.findElement(By.xpath("(//a[starts-with(@href,'index')])[1]"));
		WebElement home8 = driver.findElement(By.xpath("(//a[starts-with(text(),'Ho')])"));
		WebElement home9 = driver.findElement(By.xpath("(//a[contains(text(),'Hom')])"));

		// Input form

		WebElement inputForm1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		WebElement inputForm2 = driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[2]"));
		WebElement inputForm3 = driver.findElement(By.xpath("(//a[contains(@href,'simple-form')])[2]"));
		WebElement inputForm4 = driver.findElement(By.xpath("(//a[starts-with(@href,'simple')])[2]"));
		WebElement inputForm5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[2]"));
		WebElement inputForm6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[2]"));

		//// a[text()= 'Input Form'] - NOT WORKING

		// Data pickers
		WebElement picker1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		WebElement picker2 = driver.findElement(By.xpath("(//a[@href='date-picker.php'])"));
		WebElement picker3 = driver.findElement(By.xpath("(//a[contains(@href,'date-picker')])"));
		WebElement picker4 = driver.findElement(By.xpath("(//a[starts-with(@href,'date')])"));
		WebElement picker5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[3]"));
		WebElement picker6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[3]"));

		// table

		WebElement table1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));
		WebElement table2 = driver.findElement(By.xpath("(//a[@href='table-pagination.php'])"));
		WebElement table3 = driver.findElement(By.xpath("(//a[contains(@href,'table')])"));
		WebElement table4 = driver.findElement(By.xpath("(//a[starts-with(@href,'table')])"));
		WebElement table5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[4]"));
		WebElement table6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[4]"));

		// Progress bars

		WebElement pbar1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[5]"));
		WebElement pbar2 = driver.findElement(By.xpath("(//a[@href='jquery-progress-bar.php'])"));
		WebElement pbar3 = driver.findElement(By.xpath("(//a[contains(@href,'jquery-progress')])"));
		WebElement pbar4 = driver.findElement(By.xpath("(//a[starts-with(@href,'jquery')])[1]"));
		WebElement pbar5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[5]"));
		WebElement pbar6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[5]"));
		WebElement pbar7 = driver.findElement(By.xpath("//a[@id='progress-bars']"));

//alerts and modals
		WebElement am1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[6]"));
		WebElement am2 = driver.findElement(By.xpath("(//a[@href='bootstrap-alert.php'])"));
		WebElement am3 = driver.findElement(By.xpath("(//a[contains(@href,'bootstrap')])[1]"));
		WebElement am4 = driver.findElement(By.xpath("(//a[starts-with(@href,'bootstrap')])[1]"));
		WebElement am5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[6]"));
		WebElement am6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[6]"));
		WebElement pam7 = driver.findElement(By.xpath("//a[@id='alert-modal']"));

		// listbox
		WebElement lb1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[7]"));
		WebElement lb2 = driver.findElement(By.xpath("(//a[@href='bootstrap-dual-list.php'])"));
		WebElement lb3 = driver.findElement(By.xpath("(//a[contains(@href,'bootstrap')])[2]"));
		WebElement lb4 = driver.findElement(By.xpath("(//a[starts-with(@href,'bootstrap')])[2]"));
		WebElement lb5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[7]"));
		WebElement lb6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[7]"));
		WebElement plb7 = driver.findElement(By.xpath("//a[@id='list0box']"));

		// others

		WebElement others1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[8]"));
		WebElement others2 = driver.findElement(By.xpath("(//a[@href='drag-drop.php'])"));
		WebElement others3 = driver.findElement(By.xpath("(//a[contains(@href,'drag')])"));
		WebElement others4 = driver.findElement(By.xpath("(//a[starts-with(@href,'drag')])"));
		WebElement others5 = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[8]"));
		WebElement others6 = driver.findElement(By.xpath("(//a[starts-with(@class,'nav')])[8]"));
		WebElement others7 = driver.findElement(By.xpath("//a[@id='others']"));

		// simple form
		WebElement form1 = driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[2]"));
		WebElement form2 = driver.findElement(By.xpath("(//a[contains(@href,'simple-form-demo.php')])[2]"));
		WebElement form3 = driver.findElement(By.xpath("(//a[starts-with(@href,'simple')])[2]"));
		// select input

		WebElement si1 = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		WebElement si2 = driver.findElement(By.xpath("//a[contains(@href,'-input.php')]"));
		WebElement si3 = driver.findElement(By.xpath("//a[starts-with(@href,'select')]"));

		// single input

		WebElement single1 = driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		WebElement single2 = driver.findElement(By.xpath("(//div[contains(@class,'-header')])[2]"));
		WebElement single3 = driver.findElement(By.xpath("/(//div[starts-with(@class,'card')])[4]"));

		// Enter message

		WebElement message1 = driver.findElement(By.xpath("//label[@for='inputEmail4']"));
		WebElement message2 = driver.findElement(By.xpath("//label[contains(@for,'inputEmail4')]"));

		WebElement message3 = driver.findElement(By.xpath("//label[starts-with(@for,'input')]"));

		WebElement message4 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement message5 = driver.findElement(By.xpath("//label[contains(text(),'Message')]"));

		WebElement message6 = driver.findElement(By.xpath("(//label[starts-with(text(),'Enter')])[3]"));
		// Show message
		WebElement show1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		WebElement show2 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		WebElement show3 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement show4 = driver.findElement(By.xpath("//button[text()='Show Message']"));

		// Your message

		WebElement ymsg1 = driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement ymsg2 = driver.findElement(By.xpath("(//div[@class='my-2'])[1]"));
		

	}

}

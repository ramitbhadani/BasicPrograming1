package basicsLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicPrograming1 {
	public static WebDriver driver;
	public static String URL = "http://newtours.demoaut.com/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Documents\\Ramit\\Automation\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name ='firstName']")).sendKeys("Ramit");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bhadani");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("4795445426");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ramit1788@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Main Street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Marlborogh");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("MA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("01752");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(countryDropdown);
		sel.selectByValue("215");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramit1788@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		System.out.println("User has successfully register    " + driver.getTitle());
		String success = driver.getCurrentUrl();
		String type= success.toLowerCase();
		if(type.contains("success")){
			driver.findElement(By.linkText("Home")).click();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ramit1788@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
			driver.findElement(By.xpath("//input[@name='login']")).click();
		}
		else { System.out.println("User Login Failed"); }
		
	}
}
	
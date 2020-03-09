package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuuton {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/");
				//driver.findElement(By.linkText("Log in")).click();
				List<WebElement> rb=driver.findElements(By.name("pollanswers-1"));
				((WebElement) rb.get(1)).click();
				
			
		// TODO Auto-generated method stub

	}

}

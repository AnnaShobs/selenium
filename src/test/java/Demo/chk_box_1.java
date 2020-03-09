package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chk_box_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/");
				driver.findElement(By.id("small-searchterms")).sendKeys("book");
				driver.findElement(By.xpath("//input[@value='Search']")).click();
				driver.findElement(By.id("As")).click();
	}

}

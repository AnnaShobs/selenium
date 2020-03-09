package democart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class democart {

	  WebDriver driver;
	  String url="https://demo.opencart.com/";
 @Test
  public void login()
  {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
  }
  @Test
  public void Enterids()
  {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"input-email\"]")).click();
	  driver.findElement(By.id("input-email")).sendKeys("annatestingsel@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"input-password\"]")).click();
	  driver.findElement(By.id("input-password")).sendKeys("annasred1");
	
  }
  @Test
  public void presslogin()
  {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"input-email\"]")).click();
	  driver.findElement(By.id("input-email")).sendKeys("annatestingsel@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"input-password\"]")).click();
	  driver.findElement(By.id("input-password")).sendKeys("annasred1");
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
 }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get(url);
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("http://www.tinyupload.com/");
driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\BLTuser.BLT84\\Desktop\\ISTQB 1.docx");
driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
}
}

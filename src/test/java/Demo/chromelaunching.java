package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
		// TODO Auto-generated method stub

	}

}

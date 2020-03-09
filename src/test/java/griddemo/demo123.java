package griddemo;


	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class demo123{

			// TODO Auto-generated method stub
			public class Testcase {
				WebDriver driver;
				String Baseurl,nodeurl;
				@BeforeTest
				public void setup() throws MalformedURLException
				{
					Baseurl="http://https://opensource-demo.orangehrmlive.com/";
					nodeurl="http://192.168.0.83:5566/wd/hub";
					DesiredCapabilities capability=DesiredCapabilities.chrome();
					capability.setBrowserName("chrome");
					capability.setPlatform(Platform.WINDOWS);
					driver=new RemoteWebDriver(new URL(nodeurl),capability);
				}
				@AfterTest
			public void aftertest()
			{
				driver.quit();
			}
			@Test
			public void simpletest()
			{
				driver.get(Baseurl);
				String a=driver.getTitle();
				System.out.println("Title of the page" +a);
				
			}
			}
		}




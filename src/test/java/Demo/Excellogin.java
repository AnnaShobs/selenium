package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excellogin {
	@Test
	public static void main(String[] args)throws IOException, InterruptedException,NullPointerException
	{
		FileInputStream file=new FileInputStream(new File("C:\\eclipse\\mavenDemo\\src\\test\\java\\Demo\\test1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		for(int i=1;i<=count;i++)
		{
			XSSFRow row1=sheet.getRow(i);
			XSSFCell cell=row1.getCell(0);
			String un=cell.getStringCellValue();
			XSSFCell cell1=row1.getCell(1);
			String pwd=cell1.getStringCellValue();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.close();
		//driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b"));
			
			
		}
		
		
	}

}

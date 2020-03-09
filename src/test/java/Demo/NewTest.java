package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Testcase1() {
	  System.out.println("testcase1");
	  
  }  @Test
  public void Testcase2() {
	  System.out.println("testcase2");
		
  }  @Test
  public void Testcase3() {
	  System.out.println("testcase3");
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod:launch app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod:close app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass:prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass:clear log");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest:open Db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest:close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite:smokeesting");
  }

  @AfterSuite
  public void afterSuite() {
	 System.out.println("afterSuite:generate reports");
  }

}

package democart;

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
  public void testcase1() {
	  System.out.println("testcase1 is used");
  }
  @Test
  public void testcase2() {
	  System.out.println("testcase2 is used");
  }
  @Test
  public void testcase3() {
	  System.out.println("testcase3 is used");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("testcase3 is used");
  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod is launched app");
  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforclass it prepares the test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class it will clea the test");
  }

 

}

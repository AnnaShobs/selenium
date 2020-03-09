package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependonmethods {
	 @Test
	  public void login() {
		  System.out.println("login");
		  
	  }  @Test(dependsOnMethods= {"login"})
	  public void search() {
		  System.out.println("search");
		  Assert.assertEquals("abc", "xyx");
			
	  }  @Test(dependsOnMethods= {"search"},alwaysRun=false)
	  public void logout() {
		  System.out.println("logout");
			
	  }

}

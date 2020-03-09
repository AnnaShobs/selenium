package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsObGrou {
	@Test(dependsOnGroups= {"functional testing","smoke testing"})
	  public void login() {
		  System.out.println("Testcase1");
		  
	  }  @Test(dependsOnGroups= {"functional testing","sanity testing"})
	  public void search() {
		  System.out.println("Testcase2");
		 
			
	  }  @Test(dependsOnGroups= {"regression testing","Re testing"})
	  public void logout() {
		  System.out.println("Testcase3");
			
	  }

}

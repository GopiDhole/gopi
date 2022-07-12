package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUSe {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune1";
//	  Assert.assertEquals(a, b, "a and b values are not matching TC is Failed");
//	  Reporter.log("a and b values are matching TC is passed", true);
	  
	  Assert.assertNotEquals(a, b, "a and b values are matched TC is failed");
	  Reporter.log("a and b values are not matched TC is passed",true);
  }
}

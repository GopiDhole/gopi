package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="abc";
	  
//	  Assert.assertNull(b, "TC is FAiled value is not null");
//	  Reporter.log("TC is passed value is null",true);
	  
	  Assert.assertNotNull(b, "TC is Failed value is null");
	  Reporter.log("TC is passed Value is not null",true);
	  Assert.fail();
	   }
}

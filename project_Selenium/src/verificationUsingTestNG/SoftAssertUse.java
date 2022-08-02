package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod1() 
  {
	  String a="abc";
	  String b=null;
	  //to use soft assert we need to create object of softassert class
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a, b, "Both are  equal TC is Failed");
	  Reporter.log("Both are not equal TC is pass",true);
	  soft.assertNull(a, "Value is not null TC is failed");
	  soft.assertNotNull(b, "value is null tc is failed");
	  Reporter.log("value is null TC is pass",true);
	  //Assert.fail();
	  soft.assertAll();
  }
  @Test
  public void testing()
  {
	  boolean a=true;
	  boolean b=false;
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(b,"Value is false TC is failed");
	  s.assertFalse(a, "VAlue is true TC is failed");
	  s.assertAll();
  }
  
}

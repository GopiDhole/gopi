package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune1";
	  Assert.assertNotEquals(a, b, "TC is failed values are equals");
	  Assert.assertNotNull(b,"TC is failed value is null");
  }
}

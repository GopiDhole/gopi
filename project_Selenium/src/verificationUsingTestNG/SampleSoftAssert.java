package verificationUsingTestNG;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleSoftAssert {
  @Test
  public void f() {
	  String name="";
	  //Assert.assertNotNull(name, "name is null, TC failed");
//	  Assert.assertNull(name, "name is not null TC failed");

	  SoftAssert soft=new SoftAssert();
	  soft.assertNull(name,"name is not null TC is failed");
	  //soft.assertNotNull(name, "asbcb");
	  
  }
}

package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerStudy.Listener.class)
public class MyTest1 {
  @Test
  public void myMethod1() 
  {
	 Reporter.log("Hi I am myMethod1",true);
  }
  @Test
  public void myMethod2()
  {
	Reporter.log("Hi I am my metho2",true);
	Assert.fail();
  }
  @Test
  public void myMethod3()
  {
	  Reporter.log("Hi I am myMethod3",true);
  }
}

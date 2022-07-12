package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerStudy.Listener.class)
public class MyTest2 {
  @Test
  public void mymethod4() 
  {
	  Reporter.log("Hi I am myMethod4",true);
  }
  @Test
  public void myMethod5()
  {
	  Reporter.log("Hi I am myMethod5",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods= {"myMethod5"})
  public void myMethod6()
  {
	  Reporter.log("Hi I am myMethod6",true);
  }
  
}

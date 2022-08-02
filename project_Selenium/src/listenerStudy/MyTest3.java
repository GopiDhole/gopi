package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerStudy.Listener.class)
public class MyTest3 {
	@Test
	public void myMethod7()
	{
		Reporter.log("Hi I am myMethod7",true);
	}
	@Test
	public void myMethod8()
	{
		Reporter.log("Hi I am mymethod8 ",true);
		Assert.fail();
	}
	@Test(dependsOnMethods= {"myMethod8"})
	public void myMethod9()
	{
		Reporter.log("Hi I am myMethod9 ",true);
	}
}

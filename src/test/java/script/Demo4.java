package script;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {

	@BeforeMethod
	public void bm()
	{
		System.out.println("BM");
	}

	@Test
	public void createUser()
	{
		System.out.println("CU");
	}
}

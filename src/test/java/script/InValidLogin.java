package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class InValidLogin extends BaseTest {

	@Test(priority =2)
	
	public void testInvalidLogin() {
		
		//get Test Data
		String un=Utility.getXLCellData(XL_PATH, "InValidLogin",1, 0);
		String pw=Utility.getXLCellData(XL_PATH, "InValidLogin",1, 1);
//		
//		1. enter invalid user name
		test.info("enter invalid User Name:"+un);
		LoginPage Lp = new LoginPage(driver);
		Lp.setUserName(un);
		
//		2. enter invalid password
		test.info("enter invalid Password:"+pw);
		Lp.setPassword(pw);
		
//		3. click on go button
		Lp.clickGoButton();
		
//		4. should display error message
		test.info("should display error message");
		boolean result = Lp.verifyErrMsgIsDisplayed(wait);
		System.out.println(result);
		Assert.assertTrue(result);
		
	}

}


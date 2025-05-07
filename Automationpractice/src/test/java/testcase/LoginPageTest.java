package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lp;

	@Test(priority=1)
	public void isUserAbleToLoginWithValidCredentials() {
		lp = new LoginPage(driver);
		lp.login("admin@clinic.com", "123456");
		
	}
	@Test(priority=2)
	public void isUserAbleToLoginWithInvalidCredentials() {
		lp=new LoginPage(driver);
		lp.login("admin@gmail.com", "123");		
		Assert.assertTrue(lp.getErrorMessage(),"::failed");
 
		
	}
}

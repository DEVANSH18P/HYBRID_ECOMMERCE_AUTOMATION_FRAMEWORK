package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
		
		
		loginPage.login("standard_user", "secret_sauce");
		
		String expectedTitle  = "Swag Labs";
		
		String actualTitle =  driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Login Successfully");
	}

}

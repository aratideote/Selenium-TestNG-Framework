package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resources.Baseclass;

import pageObjectModel.homePageObject;
import pageObjectModel.loginPageObject;

public class LoginTestCases extends Baseclass {

	@Test
	public void invalidLoginTest() throws IOException {

		homePageObject hpo = new homePageObject(driver);

		hpo.clickOnMyAccount().click();
		hpo.clickOnLogin().click();

		loginPageObject lpo = new loginPageObject(driver);

		lpo.enterEmail().sendKeys(RegisterationTestCases.randomEmail);
		lpo.enterLPassword().sendKeys("test123");
		lpo.clickOnLogin().click();

	}

}

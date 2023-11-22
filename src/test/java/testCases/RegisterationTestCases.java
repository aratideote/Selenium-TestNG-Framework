package testCases;

import java.io.IOException;

import org.testng.annotations.Test;


import com.Resources.Baseclass;
import com.Resources.commonMethods;
import com.Resources.constants;

import pageObjectModel.homePageObject;

import pageObjectModel.registerationPageObjects;

public class RegisterationTestCases extends Baseclass {

	
	public static String randomEmail = "";

	@Test
	public void verifyRegisterationWithInBlankData() throws IOException, InterruptedException {

		

		homePageObject hpo = new homePageObject(driver);
		

		   commonMethods.putExplicitWait(driver,5, hpo.clickOnMyAccount());

		hpo.clickOnMyAccount().click();
		hpo.clickOnRegister().click();

		registerationPageObjects rpo = new registerationPageObjects(driver);

		rpo.enterFirstName().sendKeys("");

		rpo.enterLastName().sendKeys("");

		rpo.enterEmail().sendKeys("");

		rpo.entertelephone().sendKeys("");
		rpo.enterpassword().sendKeys("");
		rpo.enterconfirmpass().sendKeys("");
		rpo.clickOnSubscribe().click();
		// rpo.acceptPrivacyPolicy().click();
		rpo.clickOnContinueButton().click();

		commonMethods.handleAssertions(rpo.captureFirstNameErrorMsg().getText(), constants.firtNameErroMsg );
		   
		commonMethods.handleAssertions(rpo.captureLastNameErrorMsg().getText(), constants.lastNameErrorMsg );


		

	}

	// you can generate random data by faker ,
	// https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java
	// https://www.youtube.com/watch?v=RWtM5AQaiA8
	public String generateRandomEmail() {

		return System.currentTimeMillis() + "@gmail.com";

	}

	@Test(dependsOnMethods = "verifyRegisterationWithInBlankData")

	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {

		 randomEmail=generateRandomEmail();
		  registerationPageObjects rpo = new registerationPageObjects(driver);



		
		commonMethods.putExplicitWait(driver, 10, rpo.enterFirstName());

		
		
		rpo.enterFirstName().clear();
		rpo.enterFirstName().sendKeys();

		rpo.enterLastName().sendKeys();

		rpo.enterEmail().sendKeys("randomEmail");
		rpo.entertelephone().sendKeys();
		rpo.enterpassword().sendKeys();
		rpo.enterconfirmpass().sendKeys();
		rpo.clickOnSubscribe().click();
		Thread.sleep(2000);
		rpo.acceptPrivacyPolicy().click();
		rpo.clickOnContinueButton().click();

  commonMethods.handleAssertions(driver.getCurrentUrl(), constants.successUrl);

		

	}

}

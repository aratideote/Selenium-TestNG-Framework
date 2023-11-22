package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerationPageObjects {

	public WebDriver driver;

	private By firstName = By.xpath("//input[@name='firstname']");

	private By lastName = By.xpath("//input[@name='lastname']");

	private By Email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By passwordconf = By.xpath("//input[@name='confirm']");
	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");
	private By privacyPolicy = By.xpath("//input[@type='checkbox']");
	private By continueButton = By.xpath("//input[@type='submit']");

	private By firstNameErrorMSg = By.xpath("(//div[@class='text-danger'])[1]");

	private By lastNameErrorMSg = By.xpath("(//div[@class='text-danger'])[2]");

	// driver 2 took the scope of driver from register test cases class

	public registerationPageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement enterFirstName() {

		return driver.findElement(firstName);
	}

	public WebElement enterLastName() {

		return driver.findElement(lastName);
	}

	public WebElement enterEmail() {

		return driver.findElement(Email);
	}

	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement enterconfirmpass() {
		return driver.findElement(passwordconf);
	}

	public WebElement clickOnSubscribe() {
		return driver.findElement(subscribe);
	}

	public WebElement acceptPrivacyPolicy() {
		return driver.findElement(privacyPolicy);
	}

	public WebElement clickOnContinueButton() {
		return driver.findElement(continueButton);
	}

	public WebElement captureFirstNameErrorMsg() {
		return driver.findElement(firstNameErrorMSg);
	}

	public WebElement captureLastNameErrorMsg() {
		return driver.findElement(lastNameErrorMSg);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	// Driver linkage
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Detecting Elements from the UI in HomePage screen
	@FindBy(xpath = "//*[@class='country-current']")
	private WebElement counrtires;
	
	@FindBy(xpath = "//*[@class='trial-description']/*[1]")
	private WebElement packageType;
	
	@FindBy(xpath = "//*[@class='trial-cost']")
	private WebElement packagePrice_Currency;
	

	@FindBy(xpath = "//*[@id='translation-btn']")
	private WebElement ENlanguageBTN;
	
	@FindBy(xpath = "//*[@id='ae']")
	private WebElement UAEbtn;
	
	@FindBy(xpath = "//*[@id='jo']")
	private WebElement JO_btn;
	
	@FindBy(xpath = "//*[@id='tn']")
	private WebElement Tunisia_btn;
	

	@FindBy(xpath = "//*[@id='SubmitCreate']")
	private WebElement emailAddressCreateAccBtn;

	// Method to sign in and create a new random email address
/*	public void createNewAccountUser(String email) {
		try {
			waitForElement(signin);
			clickButton(signin);
			waitForElement(emailAddressInputField);
			if (email.isEmpty()) {
				setText(emailAddressInputField, generateRandomEmail());
			} else {
				setText(emailAddressInputField, email);
			}
			clickButton(emailAddressCreateAccBtn);
			
		} catch (Exception e) {
			printValueOf("Something written wrong while type email!");
		}
		
	}*/
	
	public void chooseENLanguage()
	{
		waitForElement(ENlanguageBTN);
		clickButton(ENlanguageBTN);
		waitForElement(ENlanguageBTN);
	}
	
	public void chooseUAECountry()
	{
		clickButton(counrtires);
		waitForElement(UAEbtn);
		clickButton(UAEbtn);
		waitForElement(ENlanguageBTN);


	}
	public void chooseJordanCountry()
	{
		clickButton(counrtires);
		waitForElement(JO_btn);
		clickButton(JO_btn);
		waitForElement(ENlanguageBTN);


	}
	public void chooseTunisiaCountry()
	{
		clickButton(counrtires);
		waitForElement(Tunisia_btn);
		clickButton(Tunisia_btn);
		waitForElement(ENlanguageBTN);


	}
	
	
	public String getPackageType()
	{
		String value = getTextOf(packageType);
		return value;
	}
	public String getPackagePrice_Currency()
	{
		String value = getTextOf(packagePrice_Currency);
		return value;

	}
}

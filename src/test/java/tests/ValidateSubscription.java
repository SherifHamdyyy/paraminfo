package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import org.testng.annotations.Test;
import utilities.Helper;

public class ValidateSubscription extends TestBase {

	// Objects declaration
	// ------------------------------------------------------------------------------
	HomePage homePageObject = null;
	Helper helperObject = null;

	// Objects Initialization

	@BeforeClass
	public void initPageObject() {
		helperObject = new Helper();
		homePageObject = new HomePage(driver);
	}

	// ------------------------------------------------------------------------------
	// Test-case to check the redirection of the desired URLs
	@Test(priority = 1, enabled = true, description = "Check the redirection of the URL")
	public void Check_Website_Redirection() {
		try {
			String URL = "https://subscribe.stctv.com/";
			String ExpectedURLRedirection = "https://subscribe.jawwy.tv/eg-ar?";

			// Open the web-site
			OpenURL(URL);

			// Get the actual values from the web-site
			String ActualPageURL = helperObject.getActualPageURL();
			String ActualPageTitle = helperObject.getActualPageTitle();

			// Log the status into the test report
			reportLog("WebsiteURL", ActualPageURL, ExpectedURLRedirection);
			reportLog("PageTitle", ActualPageTitle, ExpectedURLRedirection);

			// Validation - Proper URL redirection
			Assert.assertEquals(ActualPageURL, ExpectedURLRedirection);

		} catch (Exception e) {
			// Write a reason in the report
			Assert.fail("Invalid URL in the File!");

		}
	}

	
	@Test(priority = 2, enabled = true)

	public void SelectingENlanguage() {
		homePageObject.chooseENLanguage();
	}
	
	@Test(priority = 3, enabled = true)

	public void Check_UAE_PackageDetails() {
	
		String ExpectedType = "CLASSIC";
		String ExpectedPrice = "10.00";
		String ExpectedCurrency = "AED";

		//homePageObject.chooseENLanguage();
		homePageObject.chooseUAECountry();

		String actualType = homePageObject.getPackageType(); // CLASSIC
		String actualPrice = homePageObject.getPackagePrice_Currency().split(" ")[1]; 
		String actualCurrency = homePageObject.getPackagePrice_Currency().split("/")[0].split(" ")[2]; 

		reportLog("Package Type: ", actualType, ExpectedType);
		reportLog("Package Price: ", actualPrice, ExpectedPrice);
		reportLog("Package Currency: ", actualCurrency, ExpectedCurrency);

		// Validate

		Assert.assertEquals(actualType, ExpectedType);
		Assert.assertEquals(actualPrice, ExpectedPrice);
		Assert.assertEquals(actualCurrency, ExpectedCurrency);

	}
	@Test(priority = 4, enabled = true)

	public void Check_Jordan_PackageDetails() {
	
		String ExpectedType = "CLASSIC";
		String ExpectedPrice = "0.99";
		String ExpectedCurrency = "JOD";

		homePageObject.chooseJordanCountry();

		String actualType = homePageObject.getPackageType(); // CLASSIC
		String actualPrice = homePageObject.getPackagePrice_Currency().split(" ")[1]; 
		String actualCurrency = homePageObject.getPackagePrice_Currency().split("/")[0].split(" ")[2]; 

		reportLog("Package Type: ", actualType, ExpectedType);
		reportLog("Package Price: ", actualPrice, ExpectedPrice);
		reportLog("Package Currency: ", actualCurrency, ExpectedCurrency);

		// Validate

		Assert.assertEquals(actualType, ExpectedType);
		Assert.assertEquals(actualPrice, ExpectedPrice);
		Assert.assertEquals(actualCurrency, ExpectedCurrency);

	}
	
	@Test(priority = 4, enabled = true)

	public void Check_Tunisia_PackageDetails() {
	
		String ExpectedType = "CLASSIC";
		String ExpectedPrice = "1.00";
		String ExpectedCurrency = "TND";

		homePageObject.chooseTunisiaCountry();

		String actualType = homePageObject.getPackageType(); // CLASSIC
		String actualPrice = homePageObject.getPackagePrice_Currency().split(" ")[1]; 
		String actualCurrency = homePageObject.getPackagePrice_Currency().split("/")[0].split(" ")[2]; 

		reportLog("Package Type: ", actualType, ExpectedType);
		reportLog("Package Price: ", actualPrice, ExpectedPrice);
		reportLog("Package Currency: ", actualCurrency, ExpectedCurrency);

		// Validate

		Assert.assertEquals(actualType, ExpectedType);
		Assert.assertEquals(actualPrice, ExpectedPrice);
		Assert.assertEquals(actualCurrency, ExpectedCurrency);

	}
	

}

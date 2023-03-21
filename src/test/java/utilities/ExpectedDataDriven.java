package utilities;

public class ExpectedDataDriven {
	// Get data from the property manager class and get the values from the
	// TestData - PropertyManager
	public static String websiteURL = PropertyManager.getInstance().getExpectedURL();
	public static String webSiteTitle = PropertyManager.getInstance().getExpectedWebsiteTitle();
	public static String browserName = PropertyManager.getInstance().getExpectedBrowserName();
	public static String OS = PropertyManager.getInstance().getExpectedOS();

}

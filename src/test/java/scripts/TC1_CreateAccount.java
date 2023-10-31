package scripts;

import java.net.MalformedURLException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseClass;

public class TC1_CreateAccount extends BaseClass {
	
	@Test
	public void validateHomePage() throws MalformedURLException {
		
		homePage.validateIfDisplayedTrue(homePage.Country_Select_Label);
		homePage.validateIfDisplayedTrue(homePage.Country_Select_Dropdown);
		
		homePage.validateIfDisplayedTrue(homePage.Name_Label);
		homePage.validateIfDisplayedTrue(homePage.Name_Textbox);
		
		homePage.validateIfDisplayedTrue(homePage.Gender_Label);
		homePage.validateIfDisplayedTrue(homePage.Gender_Male_Checkbox);
		homePage.validateIfDisplayedTrue(homePage.Gender_Female_Checkbox);
		
		homePage.validateIfDisplayedTrue(homePage.Shop_Button);
		
	}
	
	@Test
	@Parameters({"Country", "Name"})
	public void createAccount(String country, String name) throws MalformedURLException {
		homePage.clickOnElement(homePage.Country_Select_Dropdown);
		homePage.scollToText(country);
		homePage.clickOnText(country);
		
		homePage.sendTextToElement(homePage.Name_Textbox, name);
		
		homePage.clickOnElement(homePage.Gender_Female_Checkbox);
		homePage.clickOnElement(homePage.Gender_Male_Checkbox);
		
		homePage.clickOnElement(homePage.Shop_Button);
	
		homePage.validateIfDisplayedTrue(homePage.Products_Header);
		homePage.validateIfCorrectText(homePage.Products_Header, "Products");
	}
	
	@Test
	public void invalidAccount() throws MalformedURLException {
		homePage.clickOnElement(homePage.Shop_Button);
		
		homePage.validateToast("Please enter your name");
	}
		
}

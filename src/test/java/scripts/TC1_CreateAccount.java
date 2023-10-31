package scripts;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import common.BaseClass;

public class TC1_CreateAccount extends BaseClass {
	
	@Test
	public void creatAccount() throws MalformedURLException {
		
		homePage.validateIfDisplayedTrue(homePage.Country_Select_Label);
		homePage.validateIfDisplayedTrue(homePage.Country_Select_Dropdown);
		homePage.clickOnElement(homePage.Country_Select_Dropdown);
		homePage.scollToText("Philippines");
		homePage.clickOnText("Philippines");
		
		homePage.validateIfDisplayedTrue(homePage.Name_Label);
		homePage.validateIfDisplayedTrue(homePage.Name_Textbox);
		homePage.sendTextToElement(homePage.Name_Textbox, "VinceSerquena");
		
		homePage.validateIfDisplayedTrue(homePage.Gender_Label);
		homePage.validateIfDisplayedTrue(homePage.Gender_Male_Checkbox);
		homePage.validateIfDisplayedTrue(homePage.Gender_Female_Checkbox);
		
		homePage.clickOnElement(homePage.Gender_Female_Checkbox);
		homePage.clickOnElement(homePage.Gender_Male_Checkbox);
		
		homePage.validateIfDisplayedTrue(homePage.Shop_Button);
		homePage.clickOnElement(homePage.Shop_Button);
		
		homePage.validateIfDisplayedTrue(homePage.Products_Header);
		homePage.validateIfCorrectText(homePage.Products_Header, "Products");
		
	}
	
	
		
}

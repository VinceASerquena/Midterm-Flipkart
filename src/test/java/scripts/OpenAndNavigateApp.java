package scripts;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import common.BaseClass;

public class OpenAndNavigateApp extends BaseClass {
	
	@Test
	public void navigateFirstPage() throws MalformedURLException {
		
		faPage.validateIfDisplayedTrue(faPage.Flow_Language);
		faPage.validateIfDisplayedTrue(faPage.Flow_Login);
		faPage.validateIfDisplayedTrue(faPage.Flow_Welcome);
		
		faPage.validateIfDisplayedTrue(faPage.Choose_Language_Header);
		faPage.validateIfDisplayedTrue(faPage.Languange_English_Text);
		faPage.validateIfDisplayedTrue(faPage.Languange_English_Checkbox);
		faPage.clickOnElement(faPage.Languange_English_Checkbox);
		
		faPage.validateIfDisplayedTrue(faPage.Languange_Continue_Button);
		faPage.clickOnElement(faPage.Languange_Continue_Button);
		
	}
}

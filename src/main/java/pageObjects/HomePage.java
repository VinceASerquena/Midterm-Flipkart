package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.commonActions;

public class HomePage extends commonActions{
	
	AndroidDriver driver;
	
	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//-------------------------------------------- First Form --------------------------------------------------------//
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Select the country where you want to shop']")
	public WebElement Country_Select_Label;
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement Country_Select_Dropdown;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Your Name']")
	public WebElement Name_Label;
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement Name_Textbox;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Gender']")
	public WebElement Gender_Label;
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	public WebElement Gender_Male_Checkbox;
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	public WebElement Gender_Female_Checkbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement Shop_Button;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
	public WebElement Products_Header;
	
}

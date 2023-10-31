package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.commonActions;

public class FirstActivityPage extends commonActions{
	
	AndroidDriver driver;
	
	public FirstActivityPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Language']")
	public WebElement Flow_Language;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Login']")
	public WebElement Flow_Login;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Welcome']")
	public WebElement Flow_Welcome;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Choose your language']")
	public WebElement Choose_Language_Header;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text='English'])[2]")
	public WebElement Languange_English_Text;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text='English'])[2]/parent::android.widget.LinearLayout/preceding-sibling::android.widget.ImageView")
	public WebElement Languange_English_Checkbox;
	
	//android.widget.Button[@text = 'CONTINUE']
	@AndroidFindBy(xpath="//android.widget.Button[@text = 'CONTINUE']")
	public WebElement Languange_Continue_Button;
	
	
}

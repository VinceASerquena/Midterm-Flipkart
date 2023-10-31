package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.commonActions;

public class ViewsPage extends commonActions {

	AndroidDriver driver;
		
	public ViewsPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility="Gallery")
	public WebElement Gallery;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Photos']")
	public WebElement Photos;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView)[1]")
	public WebElement firstImage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	public WebElement ExpandableLists;
	@AndroidFindBy(accessibility = "1. Custom Adapter")
	public WebElement CustomAdapter;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='People Names']")
	public WebElement PeopleNames;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sample menu']")
	public WebElement SampleMenu;
	
	
}

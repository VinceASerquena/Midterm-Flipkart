package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class commonActions {
	
	static AndroidDriver driver;
	
	public commonActions(AndroidDriver driver) {
		commonActions.driver = driver;
	}
	
	public void longPressAction(WebElement e) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)e).getId(),"duration",2000));
	}
	
	public void scollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));	
	}
	
	public void androidScrollGesture() {
		boolean canScrollMore;
		do {
			canScrollMore=(Boolean)((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of(
					"left",100,
					"top",100,
					"width",200,
					"height",200,
					"direction","down",
					"percent",3.0
					));
		}while(canScrollMore);
	}

	public void swipeGesture(WebElement webEle) {
		try {
			((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of(
					"elementId",((RemoteWebElement)webEle).getId(),
					"direction","left",
					"percent",0.75));	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Update: "+e);
		}	
	}

	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public String getText(WebElement ele) {
		return ele.getText();
	}
	
	public void validateIfFocusableisTrue(WebElement ele) {
		Assert.assertEquals(ele.getAttribute("focusable"),"true");
	}
	public void validateIfFocusableisFalse(WebElement ele) {
		Assert.assertEquals(ele.getAttribute("focusable"),"false");
	}
	public void validateIfCorrectText(String str1, String str2) {
		
		Assert.assertEquals(str1,str2);
	
	}
	public void validateIfDisplayedTrue(WebElement ele) {
		Assert.assertTrue(ele.isDisplayed());
		System.out.println("Element is displayed");
	}
	public void validateIfDisplayedFalse(WebElement ele) {
		Assert.assertFalse(ele.isDisplayed());
		System.out.println("Element is not displayed");
	}
}

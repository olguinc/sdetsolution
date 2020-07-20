package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {

	private final String SEARCH_BOX = "search-key";
	private final String SEARCH_BUTTON = ".search-button";
	private final String AD_CLOSE_BUTTON = ".close-layer";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void search(String text) {
		waitForElementVisibility(By.cssSelector(AD_CLOSE_BUTTON));
		clickButton(By.cssSelector(AD_CLOSE_BUTTON));
		
		waitForElementClickable(By.id(SEARCH_BOX));
		enterText(By.id(SEARCH_BOX), text);
		
		clickButton(By.cssSelector(SEARCH_BUTTON));
		sleepSecond(2);
	}

}

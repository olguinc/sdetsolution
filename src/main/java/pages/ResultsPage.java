package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ResultsPage extends BasePage {

	private final String AD2_CLOSE_BUTTON = ".next-dialog-close";
	private final String PAGE_CONTENT = ".page-content";

	public ResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isSecondAdDisplayed() {
		sleepSecond(2);
		return driver.findElement(By.cssSelector(AD2_CLOSE_BUTTON)).isDisplayed();
	}

	public void closeAd() {
		clickButton(By.cssSelector(AD2_CLOSE_BUTTON));
		waitForElementInvisibility(By.cssSelector(AD2_CLOSE_BUTTON));
	}
	
	public String getPageContent() {
		return getText(By.cssSelector(PAGE_CONTENT));
	}
}

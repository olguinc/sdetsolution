package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ResultsPage extends BasePage {

	private final String AD2_CLOSE_BUTTON = ".next-dialog-close";
	private final String ITEMS_LIST = ".list-items";

	public ResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isSecondAdDisplayed() {
		waitForElementVisibility(By.cssSelector(AD2_CLOSE_BUTTON));
		return driver.findElement(By.cssSelector(AD2_CLOSE_BUTTON)).isDisplayed();
	}

	public void closeAd() {
		clickButton(By.cssSelector(AD2_CLOSE_BUTTON));
		waitForElementInvisibility(By.cssSelector(AD2_CLOSE_BUTTON));
	}
	
	public boolean checkIfListHasItems() {
		List<WebElement> items =  driver.findElements(By.cssSelector(ITEMS_LIST));

		if(items != null)
		{
		  return true;
		}
		return false;
	}

}

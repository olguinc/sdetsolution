package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 70);
    }


    public void selectDropDown(By locator, String element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(element);
    }


    public void sleepSecond(int value) {
        try {
            Thread.sleep(value * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterText(By locator, String test) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(test);
    }

    public void clickButton(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }

    public void waitForElementVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementInvisibility(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public boolean waitForUrlContains(String dataUrl) {
      return   wait.until(ExpectedConditions.urlContains(dataUrl));
    }

    public void clickOnLinkText(String link) {
        driver.findElement(By.linkText(link)).click();
    }

}

package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ResultsPage;

public class SecondAdTest extends BaseTest{
	
	private HomePage homePage;
	private ResultsPage resultsPage;

    @Test
    public void secondAdTest() {
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
        
        homePage.search("Iphone");
        assertTrue(homePage.waitForUrlContains("SearchText=Iphone"),"Url is not the expected");
        
        //Verify that second ad is displayed
        assertTrue(resultsPage.isSecondAdDisplayed(), "Second ad is not displayed");
        
        //Check if there is at least 1 item to buy
        assertTrue(resultsPage.checkIfListHasItems(), "There is no item to buy");
    }

}

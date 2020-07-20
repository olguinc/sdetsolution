package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class SecondAdTest extends BaseTest{
	
	private HomePage homePage;

    @Test
    public void secondAdTest() {
        homePage = new HomePage(driver);
        homePage.search("Iphone");
        assertTrue(homePage.waitForUrlContains("SearchText=Iphone"),"Url is not the expected");
    }

}

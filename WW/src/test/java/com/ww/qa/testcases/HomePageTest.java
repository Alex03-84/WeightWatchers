package com.ww.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ww.qa.pages.FindPage;
import com.ww.qa.pages.HomePage;
import com.ww.qa.base.QaBase;

public class HomePageTest extends QaBase {
	
	HomePage homePage;
	FindPage findPage;

	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage();
		findPage = new FindPage();
	}
  @Test(priority=1)
  public void verifyHomePageTitleTest() {
	  
	  String homePageTitle = homePage.verifyHomePageTitle();
	  Assert.assertEquals(homePageTitle, "WW (Weight Watchers): Weight Loss & Wellness Help | WW USA","Home page title not matched");
  }
  
  @Test(priority=2)
	public void clickOnFindPage(){
	  findPage= homePage.clickonFindWorkshop();
  }
  

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}

package com.ww.qa.testcases;

import org.testng.annotations.Test;

import com.ww.qa.base.QaBase;
import com.ww.qa.pages.FindPage;
import com.ww.qa.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FindPageTest extends QaBase {
	
	HomePage homePage;
	FindPage findPage;
	
	public FindPageTest() {
		super();
	}

  @Test(priority=1)
  public void verifyFindPageTitleTest() throws InterruptedException {
	  String FindPageTitle = findPage.verifyFindPageTitle();
	  
	  Assert.assertEquals(FindPageTitle, "Find WW Studios & Meetings Near You | WW USA","Find page title not matched");
  }
  
  
  @Test(priority=2)
  public void searchLocationsTest() {
	  findPage.enterZipCode("10011");
	  findPage.printTitle();
	  findPage.clickOnFirstSearch();
	  findPage.verifySearchResult();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  initialization();
	  homePage = new HomePage();
	  findPage = new FindPage();
	  findPage= homePage.clickonFindWorkshop();

  }

  @AfterMethod
  public void afterMethod() {
		driver.quit();

  }

}

package com.ww.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ww.qa.base.QaBase;

public class HomePage extends QaBase{
	
	@FindBy(linkText="Find a Workshop")
	WebElement findWorkshopLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public FindPage clickonFindWorkshop() {
		findWorkshopLink.click();
		return new FindPage();
	}

	
}

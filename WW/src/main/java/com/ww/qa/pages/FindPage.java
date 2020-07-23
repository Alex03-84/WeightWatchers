package com.ww.qa.pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ww.qa.base.QaBase;

public class FindPage extends QaBase {
	Date date = new Date();

	@FindBy(id="location-search")
	WebElement locationSearch;
	
	@FindBy(className="rightArrow-daPRP")
	WebElement findLocBttn;

	@FindBy(className="distance-OhP63")
	WebElement distance;
	
	@FindBy(className="linkUnderline-1_h4g")
	WebElement locationTitle;
	
	@FindBy(className="locationName-1jro_")
	WebElement locationHeader;
	
	@FindBy(className="dayName-1UpF5")
	List<WebElement> day;
	
	@FindBy(className="meeting-14qIm")
	List<WebElement> data;
	
	public FindPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyFindPageTitle(){
		return driver.getTitle();
    }
	
	public void enterZipCode(String zipCode) {
		locationSearch.sendKeys(zipCode);
		findLocBttn.click();
		
	}
	
	public void printTitle() {
		System.out.println(locationTitle.getText());
		System.out.println(distance.getText());
	}
	
	public void verifySearchResult() {
		
		Assert.assertEquals(locationTitle.getText(),  locationHeader.getText(), "Title does not match as expected.");
		String lastDate = (date.toString().trim());
		System.out.println(lastDate);
		String[] ouput = lastDate.split(" ");
		String days= ouput[0];
		System.out.println(days);
		 for (int i=0; i<day.size();i++) {
			 for(int j=0; j<data.size();j++) {
				 
			 }
		 }
		if(days.equals("Sun")) {
			
			System.out.println(day.get(0).getText());
			System.out.println(data.get(0).getText());
			System.out.println(data.get(1).getText());
			System.out.println(data.get(2).getText());

		}
		
		else if(days.equals("Mon")) {
			
			System.out.println(day.get(1).getText());
			System.out.println(data.get(3).getText());
			System.out.println(data.get(4).getText());
			System.out.println(data.get(5).getText());
		}

		else if(days.equals("Tue")) {
			
			System.out.println(day.get(2).getText());
			System.out.println(data.get(6).getText());
			System.out.println(data.get(7).getText());
			System.out.println(data.get(8).getText());
			System.out.println(data.get(9).getText());
		}

		else if(days.equals("Wed")) {
			
			System.out.println(day.get(3).getText());
			System.out.println(data.get(10).getText());
			System.out.println(data.get(11).getText());
			System.out.println(data.get(12).getText());
		}

		else if(days.equals("Thu")) {
			
			System.out.println(day.get(4).getText());
			System.out.println(data.get(13).getText());
			System.out.println(data.get(14).getText());
			System.out.println(data.get(15).getText());
			System.out.println(data.get(16).getText());
			System.out.println(data.get(17).getText());

		}

		else if(days.equals("Fri")) {
			
			System.out.println(day.get(5).getText());
			System.out.println(data.get(18).getText());
			System.out.println(data.get(19).getText());
			System.out.println(data.get(20).getText());

		}
		else if(days.equals("Sat")){
			
			System.out.println(day.get(6).getText());
			System.out.println(data.get(21).getText());
			System.out.println(data.get(22).getText());
			System.out.println(data.get(23).getText());

		}
		else {
			System.out.println("wrong day");
		}
			
		


	}
	
	public void clickOnFirstSearch() {
		locationTitle.click();
		
	}
}

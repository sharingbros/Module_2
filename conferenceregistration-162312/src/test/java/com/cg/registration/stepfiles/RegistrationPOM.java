package com.cg.registration.stepfiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {

	WebDriver driver;
	
	@FindBy(name="txtFN")
	private WebElement firstName;
	
	@FindBy(name="txtLN")
	private WebElement lastName;
	
	@FindBy(name="Email")
	private WebElement mail;

	@FindBy(name="Phone")
	private WebElement mobile;

	@FindBy(name="size")
	private WebDriver people;

	@FindBy(name="Address")
	private WebElement buliding;
	
	@FindBy(name="Address2")
	private WebElement areaName;

	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;

	@FindBy(name="memberStatus")
	private WebElement conferenceStatus;
	
	

	@FindBy(xpath="/html/body/form/table/tbody/tr[14]/td/a")
	private WebElement link;
	
	
	public WebElement getLink() {
		return link;
	}

	public void setLink() {
		this.link.click();
	}

	public RegistrationPOM() {
		super();
	}
	
	public RegistrationPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail.sendKeys(mail);
	}
	
	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}
	
	public WebDriver getPeople() {
		return people;
	}

	public void setPeople(String people) {
		Select pla=new Select(driver.findElement(By.name("size")));
		pla.selectByVisibleText(people);
	}
	
	public WebElement getBuliding() {
		return buliding;
	}

	public void setBuliding(String buliding) {
		this.buliding.sendKeys(buliding);
	}

	public WebElement getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName.sendKeys(areaName);
	}
	
	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		Select placeCity=new Select(driver.findElement(By.name("city")));
		placeCity.selectByVisibleText(city);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String state) {
		Select placeState=new Select(driver.findElement(By.name("state")));
		placeState.selectByVisibleText(state);
	}
	
	public WebElement getConferenceStatus() {
		return conferenceStatus;
	}

	public void setConferenceStatus(String conferenceStatus) {
		List<WebElement> status=driver.findElements(By.name("memberStatus"));
		for (WebElement webElement : status) {
			if(webElement.getAttribute("value").equalsIgnoreCase(conferenceStatus))
			{
				webElement.click();
				this.conferenceStatus=webElement;
			}
		}
	}
}

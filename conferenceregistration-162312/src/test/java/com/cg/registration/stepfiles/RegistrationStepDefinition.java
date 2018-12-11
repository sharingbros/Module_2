package com.cg.registration.stepfiles;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {

	WebDriver driver;
	WebElement link;
	WebElement fname;
	RegistrationPOM register;
	String alertMessage;
	

	@Given("^user is on register page$")
	public void user_is_on_register_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\basayed\\Desktop\\BDD jar-files\\chromedriver.exe");
		 driver=new ChromeDriver();
		 register=new RegistrationPOM(driver);
		 driver.get("file:///C:/Users/basayed/Desktop/ConferenceRegistartion.html");
	}

	@Then("^display the title$")
	public void display_the_title()  {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

	@When("^user click the next  link$")
	public void user_click_the_next_link()  {
	    // Write code here that turns the phrase above into concrete actions
	   register.setFirstName("");
	   register.setLink();
	   alertMessage=driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	}

	@Then("^display alert firstname message$")
	public void display_alert_firstname_message() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(alertMessage);
	   driver.close();
	}

	@When("^user click the next  link after lastname filled$")
	public void user_click_the_next_link_after_lastname_filled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    register.setFirstName("Bazith");
	    register.setLastName("");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert lastname message$")
	public void display_alert_lastname_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
		  driver.close();
	}

	@When("^user click the next link after mail filled$")
	public void user_click_the_next_link_after_mail_filled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert mailid message$")
	public void display_alert_mailid_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
		driver.close();
	}
	
	@When("^user click the next link after contact filled$")
	public void user_click_the_next_link_after_contact_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert contact message$")
	public void display_alert_contact_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
		driver.close();
	}

	@When("^user click the next link after contact correct filled$")
	public void user_click_the_next_link_after_contact_correct_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("888638553");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	
	@Then("^display alert contact correct message$")
	public void display_alert_contact_correct_message()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(alertMessage);
	    driver.close();
	}
	
	@When("^user click the next link after number of people filled$")
	public void user_click_the_next_link_after_number_of_people_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert number of people message$")
	public void display_alert_number_of_people_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}
	
	@When("^user click the next link after buliding  and room number filled$")
	public void user_click_the_next_link_after_buliding_and_room_number_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert buliding  and room number message$")
	public void display_alert_buliding_and_room_number_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}

	@When("^user click the next link after area name  filled$")
	public void user_click_the_next_link_after_area_name_filled() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("M.V villas");
	    register.setAreaName("");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert area name message$")
	public void display_alert_area_name_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}
	
	@When("^user click the next link after city name  filled$")
	public void user_click_the_next_link_after_city_name_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("M.V villas");
	    register.setAreaName("sipcot");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert city name message$")
	public void display_alert_city_name_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}

	@When("^user click the next link after state name  filled$")
	public void user_click_the_next_link_after_state_name_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("M.V villas");
	    register.setAreaName("sipcot");
	    register.setCity("Chennai");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert state name message$")
	public void display_alert_state_name_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}
	
	@When("^user click the next link after conference status  filled$")
	public void user_click_the_next_link_after_conference_status_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("M.V villas");
	    register.setAreaName("sipcot");
	    register.setCity("Chennai");
	    register.setState("Tamilnadu");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

	@Then("^display alert conference status message$")
	public void display_alert_conference_status_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}
	
	@When("^user click the next link after details  filled$")
	public void user_click_the_next_link_after_details_filled() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		register.setFirstName("Bazith");
	    register.setLastName("Sayed");
	    register.setMail("sayeedbazith80@gmail.com");
	    register.setMobile("8886385538");
	    register.setPeople("1");
	    register.setBuliding("M.V villas");
	    register.setAreaName("sipcot");
	    register.setCity("Chennai");
	    register.setState("Tamilnadu");
	    register.setConferenceStatus("member");
	    register.setLink();
	    Thread.sleep(2500);
	    alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.navigate().to("file:///C:/Users/basayed/Desktop/PaymentDetails.html");
		Thread.sleep(1000);
	}

	@Then("^display alert navigation page message$")
	public void display_alert_navigation_page_message()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(alertMessage);
	    driver.close();
	}
}

package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition1 extends Baseclass {
	@Given("user need to be in home page")
	public void user_need_to_be_in_home_page() {
	   chromebrowser();
	   geturl("https://www.jeanswest.com.au/");
	   maximize();
	   
	}

	@When("user need to click on login page")
	public void user_need_to_click_on_login_page() {
		WebElement acc = driver.findElement(By.xpath("//i[@class='icon-myaccount']"));
		acc.click();
		
		
	  
	}
	@When("user should enter valid username and password")
	public void user_should_enter_valid_username_and_password() {
		WebElement user = driver.findElement(By.xpath("//input[@id='login-form-email']"));
		fillbox(user,"anand110794@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='login-form-password']"));
		fillbox(pass,"Ana11nd@94");
	   
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	    WebElement log = driver.findElement(By.xpath("//button[text()='Login']"));
	    log.click();
	}

	@Then("user will navigate to credential page")
	public void user_will_navigate_to_credential_page() {
	  
	}



}

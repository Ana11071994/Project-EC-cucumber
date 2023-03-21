package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Baseclass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition2  extends Baseclass{
	@When("user should mouseover to women menu")
	public void user_should_mouseover_to_women_menu() {
		WebElement women = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
		mouseover(women);
	   
	}

	@When("user need to click on dresses option")
	public void user_need_to_click_on_dresses_option() {
		WebElement dress = driver.findElement(By.xpath("(//a[@class='dropdown-link '])[5]"));
		dress.click();
	  
	}

	@When("user should click on first product")
	public void user_should_click_on_first_product() {
		WebElement prod = driver.findElement(By.xpath("(//a[@class='link'])[1]"));
		prod.click();
	   
	}

	@Then("user will navigate to product page")
	public void user_will_navigate_to_product_page() {
  WebElement sizeoption = driver.findElement(By.xpath("//a[@title='Select Size 10']"));
  mouseover(sizeoption);
  WebElement size = driver.findElement(By.xpath("//a[@title='Select Size 10']"));
  size.click();
  WebElement cart = driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-custom']"));
  cart.click();
  
	   
	}



}

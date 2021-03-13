package com.crowdstreet;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crowdstreetautomation {
	WebDriver driver;
	public static void main(String[] args) throws Throwable {}
		

@Given("^user open web browser and navigate to CR CREATE AN ACCOUNT screen$")
public void user_open_web_browser_and_navigate_to_CR_CREATE_AN_ACCOUNT_screen() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.get("https://test.crowdstreet.com/invexp/properties/all?");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
    
}

@Then("^user Navigate to Page and Click on CREATE AN ACCOUNT$")
public void user_Navigate_to_Page_and_Click_on_CREATE_AN_ACCOUNT() throws Throwable {
    
	driver.findElement(By.xpath("(//*[@data-react-toolbox='button'])[2]")).click();
}

@Given("^user enter a valid \"([^\"]*)\" Address$")
public void user_enter_a_valid_Address(String email) throws Throwable {
    
	driver.findElement(By.xpath("//*[@id='create_account_email']")).sendKeys(email);
}

@Given("^user enter a valid \"([^\"]*)\" and \"([^\"]*)\" for name$")
public void user_enter_a_valid_and_for_name(String firstName, String lastName) throws Throwable {
	driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys(firstName);
	driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys(lastName);
    
}

@Given("^user enter a valid \"([^\"]*)\" and \"([^\"]*)\" for password$")
public void user_enter_a_valid_and_for_password(String passOne, String passTwo) throws Throwable {
	driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys(passOne);
	driver.findElement(By.xpath("(//*[@type='password'])[3]")).sendKeys(passTwo);
    
}

@Given("^user enter a valid \"([^\"]*)\"$")
public void user_enter_a_valid(String phone) throws Throwable {
	driver.findElement(By.xpath("//*[@maxlength='15']")).sendKeys(phone);
}
	

@Then("^user click on the No button$")
public void user_click_on_the_No_button() throws Throwable {
    
	driver.findElement(By.xpath("(//*[@data-react-toolbox='radio'])[2]")).click();
}

@Then("^user click on the Agree button and I understand button$")
public void user_click_on_the_Agree_button_and_I_understand_button() throws Throwable {

    
	driver.findElement(By.xpath("(//*[@data-react-toolbox='check'])[1]")).click();
	
	driver.findElement(By.xpath("(//*[@data-react-toolbox='check'])[2]")).click();
}

//@When("^user click on the robot button$")
//public void user_click_on_the_robot_button() throws Throwable {
//    
//	driver.findElement(By.xpath("(//*[@role='presentation'])[2]")).click();
//	
//}

@Then("^user click on the Sign Up button$")
public void user_click_on_the_Sign_Up_button() throws Throwable {
    
    
	driver.findElement(By.xpath("//*[@class='account-creation-form-container sc-bdVaJa hgkmdP']")).click();


	}
	
@Then("^user navigate to next page then verify \"([^\"]*)\" message$")
public void user_navigate_to_next_page_then_verify_message(String arg1) throws Throwable {
	//driver.getTitle();
	driver.getTitle();
	  String actual = driver.getTitle();
	  String expected = "crowdstreet";
	  Assert.assertTrue("the titel is Wrong", actual.contains(expected));
	  

//	  String actule = driver.findElement(By.xpath("//*[contains(text(),'Congrats')]")).get
	  
	  
   
    
}

}
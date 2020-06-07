package com.bitrix24.step_definitions;



import com.bitrix24.pages.ActiveStreamPage;
import com.bitrix24.pages.LoginPage;

import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage ();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println ("Open LoginPage");
        String URL =com.Bitrix24.utilities.ConfigurationReader.getProperty ( "mainURL" );
        Driver.getDriver ().get ( URL );
    }
    @When("user logs in as a helpdesk")
    public void user_logs_in_as_a_helpdesk() {
        System.out.println ("Login as a HelpDesk");
        loginPage.login ( "helpdesk54@cybertekschool.com", "UserUser" );
    }
    @Then("user should verify that title is a Home")
    public void user_should_verify_that_title_is_a_Home() {
        System.out.println ("Verify that title is a Home");
        BrowserUtilities.wait ( 4 );

        Assert.assertEquals("", Driver.getDriver().getTitle());
        Driver.getDriver ().close ();


    }

}
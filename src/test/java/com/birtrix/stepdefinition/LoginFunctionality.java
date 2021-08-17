package com.birtrix.stepdefinition;

import com.birtrix.page.Zero_logn;
import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFunctionality {
    @Given("user is on login page")
    public void user_is_on_login_page() {
    }
    @Then("user give valid credential")
    public void user_give_valid_credential() {
        Pages.getZero_logn().signinButton.click();
      Zero_logn.validCredential();
    }
    @Then("user click on sign in button")
    public void user_click_on_sign_in_button() {
       Pages.getZero_logn().signInButton.click();

    }
    @Then("user should see title as {string}")
    public void user_should_see_title_as(String string) {
        WebElement a = Driver.getDriver().findElement(By.xpath("//button[@id='details-button']"));
        WebElement b = Driver.getDriver().findElement(By.xpath("//a[@id='proceed-link']"));
        a.click();
        b.click();
        BrowserUitls.titleAssert(string);
    }





    @Then("user give invalid credential")
    public void userGiveInvalidCredential() {
        Zero_logn.inValidCredential();
        Pages.getZero_logn().signinButton.click();

    }
    @Then("user should see error message that says {string}")
    public void userShouldSeeErrorMessageThatSays(String arg0) {
       Assert.assertEquals(Pages.getZero_logn().errormessage.getText(),arg0);
    }
}

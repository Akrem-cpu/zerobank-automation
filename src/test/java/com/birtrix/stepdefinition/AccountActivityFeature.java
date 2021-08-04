package com.birtrix.stepdefinition;

import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AccountActivityFeature {

    @When("user click on {string}")
    public void userClickOn(String arg0) {
        BrowserUitls.clickOnOneElementOfTheList(Pages.getALlPages().listOfAllTabs,arg0);
    }
    @Then("user should see {string} as a by default on account dropdown")
    public void user_should_see_as_a_by_default_on_account_dropdown(String string) {
    String actualDefaultValue=  BrowserUitls.selectObject(Pages.getAccountActivity().selectDropDownForAccount).getFirstSelectedOption().getText();
        Assert.assertEquals(actualDefaultValue,string);

    }


    @Then("user click on account dropdown")
    public void userClickOnAccountDropdown() {
        Pages.getAccountActivity().selectDropDownForAccount.click();
    }
    @Then("user should see under account select dropdown")
    public void user_should_see_under_account_select_dropdown(List<String> list) {
        List<WebElement> ele = BrowserUitls.selectObject(Pages.getAccountActivity().selectDropDownForAccount).getOptions();
       BrowserUitls.assertMultipleText(list,ele);
    }


}

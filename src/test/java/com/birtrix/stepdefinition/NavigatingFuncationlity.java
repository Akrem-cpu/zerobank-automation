package com.birtrix.stepdefinition;

import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigatingFuncationlity {
    @When("When the user clicks on {string} card link on the Account Summary page")
    public void whenTheUserClicksOnCardLinkOnTheAccountSummaryPage(String name) {
        Pages.getAccountSummary().allLinksUnderTables(name).click();
    }
    @Then("Account	drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedText) {
        String actualText =BrowserUitls.selectObject(Pages.getAccountActivity().selectDropDownForAccount).getFirstSelectedOption().getText();
        Assert.assertEquals(expectedText,actualText);
    }


}

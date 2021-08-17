package com.birtrix.stepdefinition;

import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;


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

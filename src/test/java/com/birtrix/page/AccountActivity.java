package com.birtrix.page;

import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivity extends ALlPages {
    public AccountActivity(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement selectDropDownForAccount;



}

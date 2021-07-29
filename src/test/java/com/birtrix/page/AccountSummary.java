package com.birtrix.page;

import com.birtrix.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummary {
    public AccountSummary(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='offset2 span8']//h2")
    public List<WebElement> allH2HeaderUnderAccountSummary;
    @FindBy(xpath = "//div[@class='offset2 span8']//div[@class='board'][3]//table//th")
    public List<WebElement> allThUnderCreditAccount;


}

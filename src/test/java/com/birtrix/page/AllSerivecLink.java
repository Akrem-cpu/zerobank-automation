package com.birtrix.page;

import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllSerivecLink {
    public AllSerivecLink(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='nav nav-tabs']//li")
    public List<WebElement> allLinkOfDiffServierc;



}

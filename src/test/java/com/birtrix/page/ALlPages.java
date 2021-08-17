package com.birtrix.page;

import com.birtrix.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ALlPages {
  public ALlPages(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//ul[@class='nav nav-tabs']/li")
    public List<WebElement> listOfAllTabs;



}

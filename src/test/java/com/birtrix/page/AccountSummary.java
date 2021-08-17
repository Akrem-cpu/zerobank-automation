package com.birtrix.page;

import com.birtrix.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummary extends ALlPages{
    public AccountSummary(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='offset2 span8']//h2")
    public List<WebElement> allH2HeaderUnderAccountSummary;
    @FindBy(xpath = "//div[@class='offset2 span8']//div[@class='board'][3]//table//th")
    public List<WebElement> allThUnderCreditAccount;
    @FindBy(xpath = "(//div[@class='board-content'])[1]//td//a")
    public List<WebElement> cashAccountTable;
    @FindBy(xpath = "(//div[@class='board-content'])[2]//td/a")
    public List<WebElement> investmentAccountTable;
    @FindBy(xpath = "(//div[@class='board-content'])[3]//td/a")
    public List<WebElement> creditAccountTable;


    public  WebElement allLinksUnderTables(String name){
        String xpath = "//div[@class='offset2 span8']//table//td//a[.='"+name+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));


    }





}

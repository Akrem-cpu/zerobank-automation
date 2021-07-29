package com.birtrix.page;

import com.birtrix.utilites.ConfiReader;
import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Zero_logn {
    public Zero_logn(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButton;
    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errormessage;










    public static void validCredential(){
        Pages.getZero_logn().usernameBox.sendKeys(ConfiReader.getProperty("username"));
        Pages.getZero_logn().passwordBox.sendKeys("password");

    }

    public static void inValidCredential(){
        Pages.getZero_logn().usernameBox.sendKeys("incorrect username");
        Pages.getZero_logn().passwordBox.sendKeys("incorrect password");
    }


    public static void Login(){
        Pages.getZero_logn().usernameBox.sendKeys(ConfiReader.getProperty("username"));
        Pages.getZero_logn().passwordBox.sendKeys("password");
        Pages.getZero_logn().signInButton.click();
        WebElement a = Driver.getDriver().findElement(By.xpath("//button[@id='details-button']"));
        WebElement b = Driver.getDriver().findElement(By.xpath("//a[@id='proceed-link']"));
        a.click();
        b.click();
    }




}

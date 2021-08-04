package com.birtrix.test;

import com.birtrix.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class A {
    @Test
    public void test(){
        Driver.getDriver().get("https://www.google.com");
     WebElement search =  Driver.getDriver().findElement(By.name("q"));
        search.sendKeys("Apple" + Keys.ENTER);


        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return  Driver.getDriver().findElement(By.xpath("//b[.='stock']"));
            }
        });
       element.click();

    }
}

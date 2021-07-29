package com.birtrix.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver(){

        if (driverPool.get() == null){
            synchronized (Driver.class) {

                String browserType = ConfiReader.getProperty("browser");


                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                }
            }
        }


        return  driverPool.get();


    }


    public static void closeDriver(){
        if( driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }

}

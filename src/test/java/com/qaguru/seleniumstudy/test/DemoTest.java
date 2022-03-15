package com.qaguru.seleniumstudy.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    private final String baseUrl="https://www.homeandstuff.com/";
    @Test
    public void testHomePageTitle() throws InterruptedException {
        System.out.println("Test for home page title");
        //system is class, out is object(static member), if you are accessing a member of a class only if that member is static
//println is method
        WebDriverManager.chromedriver().setup();//launch the browser.driver to chrome, translate to chrome
//safari dont need to setup,it comes automatically
        //WebDriverManager is class, chromedriver is static method,setup() is method
        WebDriver driver=new ChromeDriver();//selenium
        driver.get(baseUrl);// navigate to the browser
        String expTitle="Furniture, Kitchen, Dining Room, Entertainment, Bedroom Sets, Outdoor, Fireplaces";
        String actTitle= driver.getTitle();
        Assert.assertEquals(actTitle,expTitle,"Incorrect title");//runtime error, if there is exception, the program will stop there
        Thread.sleep(1000);// delay the program for 1 second and continue ,java command
        driver.quit();//quit release the entire instance of that driver, .close() is to close the window

    }

}

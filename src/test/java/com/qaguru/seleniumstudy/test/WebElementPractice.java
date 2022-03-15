package com.qaguru.seleniumstudy.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementPractice {
    private final String baseURL="https://www.qaguru.ca/webelementapp.php";
    private WebDriver driver;
    @BeforeTest
    public void beforeTest(){//launch the browser before every test
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();


    }
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get(baseURL);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void selectGender(){
        WebElement radMale= driver.findElement(By.xpath("//*[@id=\"home-5\"]/form[2]/input[1]"));
        Assert.assertTrue(radMale.isSelected(),"Male radio button is not selected by default");

        WebElement radGender= driver.findElement(By.xpath("//*[@id=\"home-5\"]/form[2]/input[2]"));
        radGender.click();


    }
}

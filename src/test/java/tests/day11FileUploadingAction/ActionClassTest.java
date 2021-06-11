package tests.day11FileUploadingAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class ActionClassTest {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown(){

        // driver.quit();
    }
    @Test
    public void Test1(){

        driver.get("http://practice.cybertekschool.com/hovers");

        driver.findElement(By.tagName("img"));
    }
}

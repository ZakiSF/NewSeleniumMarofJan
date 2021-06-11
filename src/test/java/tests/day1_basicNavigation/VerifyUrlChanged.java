package tests.day1_basicNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyUrlChanged {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("djfdfdkj@dkfjd.com");

        WebElement retrievPassworld = driver.findElement(By.id("form_submit"));
        retrievPassworld.click();

        driver.close();
    }
}

package tests.day1_basicNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("djfdfdkj@dkfjd.com");

        String actualEmail ="djfdfdkj@dkfjd.com";
        String expectedEmail= emailInput.getAttribute("value");
        if (actualEmail.equals(expectedEmail)){

            System.out.println("pass");
        }else {

            System.out.println("fail");
        }

        driver.quit();
    }
}

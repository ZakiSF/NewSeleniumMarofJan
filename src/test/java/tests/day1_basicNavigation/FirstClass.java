package tests.day1_basicNavigation;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class FirstClass {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.close();

    }
}

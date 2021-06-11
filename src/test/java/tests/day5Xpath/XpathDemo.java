package tests.day5Xpath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class XpathDemo {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        /**
         * //input[@name='uid']
         * //*[contains(@type,'sub')]
         * //input[@type='wht']
         * //*[contains(@name,'you')]
         *
         */
    }
}

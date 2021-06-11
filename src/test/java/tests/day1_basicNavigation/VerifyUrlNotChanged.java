package tests.day1_basicNavigation;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class VerifyUrlNotChanged {

    public static void main(String[] args) {
      WebDriver driver = WebDriverFactory.getDriver("chrome");

      driver.get("http://practice.cybertekschool.com/forgot_password");

      String expectedUrl = driver.getCurrentUrl();
        WebElement retrievPassworld = driver.findElement(By.id("form_submit"));
        System.out.println(expectedUrl);



        WebElement email =driver.findElement(By.name("email"));



        email.sendKeys("sharab@saqi.com");

        retrievPassworld.click();

        WebElement emailMessage = driver.findElement(By.name("confirmation_message"));
        String actualMessage = "Your e-mail's been sent!";
        String expectedMessage = emailMessage.getText();

        if (actualMessage.equals(expectedMessage)){

            System.out.println("Hooorayyy");
        }else {
            System.out.println("Get the ... out of my face");
        }

        System.out.println();








        if (expectedUrl.equals("http://practice.cybertekschool.com/forgot_password")){


            System.out.println("pass");
            }

        else {
            System.out.println("Test Faild");
        }





    }
}

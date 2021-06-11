package tests.day8_listOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class ListOfElementsTest {
    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(),6);

        for (WebElement button: buttons){

            System.out.println(button.getText());
        }
    }
    @Test
    public void printAllOptions(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element = driver.findElement(By.id("state"));

        Select statesList = new Select(element);

        List<WebElement> option = statesList.getOptions();

        for (WebElement webElement : option) {

            System.out.println(webElement.getText());
        }


    }
    @Test
    public void selectAndVerify(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select firstSelected = new Select(driver.findElement(By.id("state")));

        String printTheOption = firstSelected.getFirstSelectedOption().getText();

        List<WebElement> selectedFirst = firstSelected.getOptions();
        System.out.println(printTheOption);


    }


}

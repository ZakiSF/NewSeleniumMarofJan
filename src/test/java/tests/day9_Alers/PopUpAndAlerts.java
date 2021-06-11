package tests.day9_Alers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PopUpAndAlerts {

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
    public void popUp(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//span[.='Confirm']")).click();
        driver.findElement(By.xpath("//span[.='No']")).click();


    }

    @Test
    public void JavaScriptAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        Alert alert=driver.switchTo().alert();

        alert.getText();

        System.out.println(alert.getText());
    }

    @Test
    public void witchWindowsTest(){

        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("before new window is opened "+ driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();

        System.out.println(currentWindowHandle);

        Set<String>windowHandles = driver.getWindowHandles();

        for (String windowHandl : windowHandles){

            System.out.println(windowHandl);

            if (!currentWindowHandle.equals(windowHandl)){

                driver.switchTo().window(windowHandl);


            }
        }

        System.out.println("after switching "+ driver.getTitle());



    }
    @Test
    public void multiFrames() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Heeee");
        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

    }
    @Test
    public void explicitWait(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement remove = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(remove));

        remove.click();


        WebElement add = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));

        wait.until(ExpectedConditions.visibilityOf(add));

        add.click();




    }
}

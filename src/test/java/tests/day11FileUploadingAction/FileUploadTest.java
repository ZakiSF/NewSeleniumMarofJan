package tests.day11FileUploadingAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class FileUploadTest {

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
    public void FileUploading(){

        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/sayedmiri/Desktop/41934617_10156243435246144_7503509304373149696_n.jpg");

        driver.findElement(By.id("file-submit")).click();


    }
    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/upload");
        String filePath= "/Users/sayedmiri/Documents/SeleniumWithMarofJan/src/test/resources/file.txt";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();



    }

    @Test
    public void test3(){

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));


    }

}

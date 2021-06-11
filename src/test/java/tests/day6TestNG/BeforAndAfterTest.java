package tests.day6TestNG;

import org.testng.annotations.*;

public class BeforAndAfterTest {

    @Test
    public void TestOnd(){
        System.out.println("this is the first test");

    }

    @Test
    public void SecondTest(){
        System.out.println("this is the second Test");
    }
    @BeforeMethod
    public void beforMethod(){

        System.out.println("Befor Method");
    }

    @AfterMethod
    public void afterTest(){

        System.out.println("close the browser");
    }

    @BeforeClass
    public void beforClass(){

        System.out.println("Befor class");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("after class");
    }

}

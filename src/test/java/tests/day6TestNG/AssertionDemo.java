package tests.day6TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    public void test1(){

        Assert.assertEquals("one","one");

        System.out.println("Test Paaaaaseeed");
    }
    @Test
    public void test2(){

        Assert.assertNotEquals("one", "three");
    }

    @Test
    public void test3 (){

        Assert.assertTrue(6 >3);
    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("Befor Method");
    }
    @AfterMethod
    public void afterMethod(){

        System.out.println("Close Chrome");
    }
}

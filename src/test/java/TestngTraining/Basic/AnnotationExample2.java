package TestngTraining.Basic;

import org.testng.annotations.*;

public class AnnotationExample2 {

    @BeforeMethod //4th
    public  void Before()
    {
        System.out.println("Before Method");
    }

    @AfterMethod // 4th after end of every method/testcases
    public  void After()
    {
        System.out.println("After Method");
    }
    @Test // this is the testcases
    public void add()
    {
        System.out.println("Testcase 1 Addition:");
    }
    @Test //this is the testcases
    public void sub()
    {
        System.out.println("Testcase 2 Substraction:");
    }

    @BeforeClass  //3rd After the Before Test
    public void beforeclass()
    {
        System.out.println("Execute Before Class");
    }

    @AfterClass //Before the After Test
    public void afterclass()
    {
        System.out.println("Execute After Class");
    }

    @BeforeTest //2nd
    public void beforetest()
    {
        System.out.println("Before Test ");
    }

    @AfterTest //at the end of the testcases but before the suite
    public void aftertest()
    {
        System.out.println("After Test ");
    }

    @BeforeSuite  // 1st
    public void beforesuite()
    {
        System.out.println("Before Suite");
    }

    @AfterSuite  //At the end of the testcases or suite
    public void aftersuite()
    {
        System.out.println("After Suite ");
    }



}

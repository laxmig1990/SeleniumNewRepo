package TestngTraining.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample1 {

    WebDriver driver = new ChromeDriver();
    @BeforeMethod //Executes before any testcases start
    public void PreTest()
    {
        driver= new ChromeDriver();
    }

    @AfterMethod //Executes after the testcase is complted
    public void AfterTest()
    {
        driver.close();
    }

    @Test // This designate the method a testcases
    public void Launch_Amazon()
    {
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    @Test
    public void Launch_Edso()
    {
        driver.get("https://www.edso.in");
        driver.manage().window().maximize();
    }
}

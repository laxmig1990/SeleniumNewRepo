package TestngTraining.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestNgFirst {

    @Test(groups = "smoke")
    public void Launch_Browser()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.close();
    }

    @Test
    public void Launch_Browser1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
        driver.close();
    }
}

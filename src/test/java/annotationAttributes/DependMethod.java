package annotationAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.NOP_FallbackServiceProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependMethod {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Launch()
    {
        System.out.println("Pass");
       
    }
    @Test(dependsOnMethods = "Launch")
    public void HomePage()
    {
        System.out.println("Failed");
        driver.getTitle();

    }
    @Test(groups="smoke")
    public void Execte()
    {
        System.out.println("Execute Method");
    }
    public void Execte()
    {
        System.out.println("Execute Method");
       
    }
}



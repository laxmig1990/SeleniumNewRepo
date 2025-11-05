package parameterinTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    public static WebDriver driver;
    @BeforeMethod
    @Parameters({"browsername"})
    public void browser(String browsername)
    {
        if(browsername.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox"))
        {
            driver= new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("Edge")) {
            driver= new EdgeDriver();
        }else
            System.out.println("Enter the Valid Browser");
    }

    @Parameters({"Username","Password"})
    @Test
    public void LoginExample(String Username, String Password)
    {

        driver.get("https://www.saucedemo.com/");
        WebElement uname = driver.findElement(By.id("user-name"));
        uname.sendKeys(Username);
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys(Password);
        driver.findElement(By.id("login-button")).click();
       // WebElement ele = driver.findElement();
        Assert.assertEquals(driver.getTitle(),"Swag Labs");



    }
}

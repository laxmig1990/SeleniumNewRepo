package assertionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertExample {

    @Test
    public void AssetExampleHard1()
    {

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
        driver.get("https://www.saucedemo.com/");
        WebElement loginbtn1 = driver.findElement(By.id("login-button"));
        WebElement title = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        Assert.assertEquals(title.getText(),"Swag Labs");
        Assert.assertTrue(loginbtn1.isDisplayed());

    }
}

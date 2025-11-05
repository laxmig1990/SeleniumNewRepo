package assertionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertExample {

    @Test
    public void SoftExample()
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
        driver.get("https://www.saucedemo.com/");
        WebElement loginbtn1 = driver.findElement(By.id("login-button"));
        WebElement title = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        SoftAssert s = new SoftAssert();
        s.assertTrue(loginbtn1.isDisplayed());
        s.assertEquals(title.getText(),"Swag Labs");
        s.assertAll();
    }
}

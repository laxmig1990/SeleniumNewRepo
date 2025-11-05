package parameterinTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class DataProviderExample {

    @DataProvider(name="test-data")
    public Object[][] setdata()
    {
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"standard_user","Test"},
                {"test","test"},
                {"Test","secret_sauce"},

        };
    }

    @Test(dataProvider = "test-data")
    public void LoginMethod(String Username, String Password)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();

    }
}

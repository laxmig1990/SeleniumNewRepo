package parameterinTestNG;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExternalFileExcelData {

    @DataProvider(name = "Test-data")
    public Object[][] setData() throws IOException {
        Object[][] ao= getdata("C:\\Users\\laxmi\\OneDrive\\Desktop\\Test Data\\FetchData.xlsx","Sheet1");
        return ao;

    }

    public static Object[][] getdata(String FilePathName , String SheetName) throws IOException {
        FileInputStream ip = new FileInputStream(FilePathName);
        Workbook wo = new XSSFWorkbook(ip);
        Sheet sh = wo.getSheet("Sheet1");

        int rows = sh.getPhysicalNumberOfRows();
        int col = sh.getRow(0).getLastCellNum();
        Object[][] data = new Object[rows-1][col];

        for(int i=1 ; i<rows ; i++) {
            Row r = sh.getRow(i);
            for (int j = 0; j < col; j++) {
                Cell c = r.getCell(j);
                data[i - 1][j] = c.toString();
            }
        }
        return data;
    }

    @Test(dataProvider = "Test-data")
    public void LoginDetails(String Username , String Password)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();
        driver.close();
    }

}


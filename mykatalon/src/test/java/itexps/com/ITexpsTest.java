/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package itexps.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikea
 */
public class ITexpsTest {
    private WebDriver driver;
    
    public ITexpsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "Y:\\data\\GeckoChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
  public void testItexps() throws Exception {
    driver.get("https://www.itexps.net/");
    //Maximize browser window 
    driver.manage().window().maximize();
    TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn01label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn02label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn03label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn04label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn05label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.id("DrpDwnMn06label")).click();
     TimeUnit.SECONDS.sleep(2);
    driver.findElement(By.xpath("//div[@id='c4nz']/div[2]")).click();
    driver.quit();
   
  }
}

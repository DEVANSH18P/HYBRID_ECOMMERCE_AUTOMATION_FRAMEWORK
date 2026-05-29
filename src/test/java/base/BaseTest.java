package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
   
   @BeforeMethod
   public void setup() {

       ChromeOptions options = new ChromeOptions();

       options.addArguments("--disable-notifications");

       options.addArguments("--disable-save-password-bubble");

       options.addArguments("--disable-infobars");

       options.addArguments("--guest");

       driver = new ChromeDriver(options);

       driver.manage().window().maximize();

       driver.get("https://www.saucedemo.com/");
   }
   
    @AfterMethod
   public void tearDown() {
	   driver.quit();
   }
  
}

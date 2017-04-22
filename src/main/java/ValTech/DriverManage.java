package ValTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 22/11/2016.
 */
public class DriverManage

{
    protected static WebDriver driver;

    public DriverManage ()
    {
        PageFactory.initElements(driver,this);


    }

    public static void OpenBrowser()


    {
        String browser ="ie";
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\chromeBrowser\\chromedriver.exe");
            driver = new ChromeDriver();
        }
       else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\chromeBrowser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else{
            driver = new FirefoxDriver();}


        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.valtech.co.uk/");

    }

    public static void CloseBrowser()
    {  driver.quit();
    }
}

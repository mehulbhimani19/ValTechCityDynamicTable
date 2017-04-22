package ValTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static ValTech.DriverManage.driver;

/**
 * Created by Mehul on 22/11/2016.
 */
public class TestSuits extends DriverManage
{
    @BeforeMethod


    public static void OpenBr (){
        DriverManage.OpenBrowser();
    }
    @AfterMethod
    public static void CloseBr()
    {
//        DriverManage.CloseBrowser();
    }

    @Test()

        public void cityname()

    {
//          driver.findElement(By.xpath(".//*[@id='contacticon']/div/div/div[1]/i")).click();
//        driver.findElement(By.xpath("//*[@data-icon='earth-contact']/div/div/div[1]/i")).click();
        driver.findElement(By.xpath("//div/i")).click();

   // driver.findElement(By.className("hamburger__front_lang")).click();


       List<WebElement>Cityname= driver.findElements(By.xpath("//div[@id='contactbox']/div/div/ul/li/a[2]"));
        System.out.println("Total Number of City is "+Cityname.size());

        System.out.println("List of city name Below ");

        for ( WebElement temp : Cityname)
            {

                System.out.println(temp.getText());

            }
        System.out.println("....................................................");
        System.out.println("....................................................");

        List<WebElement>ContryName= driver.findElements(By.xpath("//*[@id='contactbox']/div/div/h3"));
        System.out.println( "Total number of country  "+ ContryName.size());

        System.out.println("List of Country name ");


        for (WebElement temp1 : ContryName)
        {
            System.out.println( temp1.getText());
        }
    }

}



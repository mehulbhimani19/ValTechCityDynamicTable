package ValTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Mehul on 24/11/2016.
 */
public class CitynamePage extends  DriverManage
{








    public void cityname()

    {
        driver.findElement(By.xpath(".//*[@id='contacticon']/div/div/div[1]/i")).click();


        List<WebElement> Cityname = driver.findElements(By.xpath("//div[@id='contactbox']/div/div/ul/li/a[2]"));   // camper all xpath and than take
        System.out.println("Total Number of City is " + Cityname.size());

        System.out.println("List of city name Below ");

        for (WebElement temp : Cityname) {

            System.out.println(temp.getText());

        }
    }

        List<WebElement>ContryName;    // globley dicler
    public void  countryNmae ()
      {
        //  List<WebElement>CountryName = driver.findElements(By.xpath("//*[@id='contactbox']/div/div/h3"));

         ContryName = driver.findElements(By.xpath("//*[@id='contactbox']/div/div/h3"));
         System.out.println( "Total number of country  "+ ContryName.size());

        System.out.println("List of Country name ");


        for (WebElement temp1 : ContryName)
        {
            System.out.println( temp1.getText());
        }
    }

}



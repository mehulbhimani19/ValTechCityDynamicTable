package ValTech;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 20/04/2017.
 */
public class DynamicTable
{


        public static void main(String[] args)
        {


            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.get("http://www.iplt20.com/match/2017/20");

            driver.findElement(By.xpath("html/body/div/div[1]/nav/div/div/div[1]/ul/li[6]/a")).click();

   //    .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/thead/tr/th[1]
   //         .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/thead/tr/th[3]
      //      .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/thead/tr/th[4]

           // .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[1]/div
          //  .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[1]/div
          //  .//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[3]


//            List<WebElement> IPLScorBord = driver.findElements(By.xpath(".//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/tbody/tr/td"));   // camper all xpath and than take
//            System.out.println("Total Number of City is " + IPLScorBord.size());
//
//            System.out.println("IPL RC scor bord Below ");
//
//            for (WebElement temp : IPLScorBord) {
//
//                System.out.println(temp.getText());
//
//            }

            List<WebElement> IPLScor = driver.findElements(By.xpath(".//*[@id='scorecardContent']/div[1]/div[1]/div[2]/table/"));


            System.out.println();;


        }
}

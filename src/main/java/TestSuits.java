import ValTech.DriverManage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Mehul on 03/12/2016.
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
        DriverManage.CloseBrowser();
    }

    @Test
    public static void CountandListOfCityNmae ()

    {

    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by mhasan on 2/20/17.
 */
public class ATest {
    static WebDriver dr;
    static String url="http://www.macys.com";
    static String home, furniture,bedBath,women,man;
    public static void main(String[]args) throws InterruptedException {
        dr.get(url);
        //dr.findElement(By.xpath("./*//*[@id='flexLabel_22672']/a")).click();//click
        System.out.println("TEST 1");

        home="./*//*[@id='flexLabel_22672']/a";
        bedBath="./*//*[@id='flexLabel_7495']/a";
        women="./*//*[@id='flexLabel_118']/a";


        WebElement ele = dr.findElement(By.xpath(home));

        Actions action = new Actions(dr);

        action.moveToElement(ele).moveToElement(dr.findElement(By.xpath(bedBath))).click().build().perform();
        //have to see how to work with multple window like hover over




    }
}

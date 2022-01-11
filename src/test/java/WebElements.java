import com.fissst.JSON_Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements {

    //class for trying to define public WebElements, for using them in other classes

    private static WebDriver driver(){
        WebDriver driver = new ChromeDriver();
        driver.get(JSON_Links.MainPage().get(0));
        return driver;
    }
    public static WebElement username = driver().findElement(By.xpath("//*[@id=\"user-name\"]"));
    public static WebElement password = driver().findElement(By.xpath("//*[@id=\"password\"]"));

}

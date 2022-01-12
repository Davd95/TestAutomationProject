import com.fissst.JSON_Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsLogin {

    //class for trying to define public WebElements in Login Page, for using them in other classes

    private static WebDriver driver = WebDriverSingleton.getInstance();

    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    //WebElements
    public static WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    public static WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    public static WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsInventory {

    //class for trying to define public WebElements in Inventory Page, for using them in other classes

    private static WebDriver driver = WebDriverSingleton.getInstance();

    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    //WebElements
    public static WebElement MenuButton = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
    public static WebElement Logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));

}

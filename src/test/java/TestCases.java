import com.fissst.JSON_Credentials;
import com.fissst.JSON_Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

    @Test
    public void TestCase1(){

        WebDriver driver = new ChromeDriver();
        driver.get(JSON_Links.MainPage().get(0));

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        username.sendKeys(JSON_Credentials.standard_user().get(0));

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys(JSON_Credentials.standard_user().get(1));

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-burger-menu-btn\"]")));
        WebElement MenuButton = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
        MenuButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        Logout.click();

    }


}

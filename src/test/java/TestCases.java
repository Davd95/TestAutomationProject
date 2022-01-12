import com.fissst.JSON_Credentials;
import com.fissst.JSON_Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCases {

    @Test
    public void TestCase1(){

        WebDriverSingleton.getInstance().get(JSON_Links.MainPage().get(0));

        WebElementsLogin.Username.sendKeys(JSON_Credentials.standard_user().get(0));
        WebElementsLogin.Password.sendKeys(JSON_Credentials.standard_user().get(1));

        WebElementsLogin.Login.click();
        WebElementsInventory.MenuButton.click();
        WebElementsInventory.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
        WebElementsInventory.Logout.click();

    }

}

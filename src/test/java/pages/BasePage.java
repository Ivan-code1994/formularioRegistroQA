package pages;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void navegarSitio(String url){
        driver.get(url);
    }
    private WebElement Selector(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void llenarDatos(String locator, String palabra){
        Selector(locator).clear();
        Selector(locator).sendKeys(palabra);
    }
    public void clickElemento(String locator){
        Selector(locator).click();
    }
    public static void cerrarNavegador(){
        driver.quit();
    }
}

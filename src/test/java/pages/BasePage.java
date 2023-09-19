package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement elemento(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void escritura(String locator, String textoEscrito) {
        elemento(locator).clear();
        elemento(locator).sendKeys(textoEscrito);
    }

    public void click(String locator) {
        elemento(locator).click();
    }

    public void maximizar() {
        driver.manage().window().maximize();
    }

    public void close() {
        driver.close();
    }
}

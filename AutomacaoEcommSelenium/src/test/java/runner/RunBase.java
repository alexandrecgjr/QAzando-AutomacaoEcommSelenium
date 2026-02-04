package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {

    protected static WebDriver driver;

    public enum Browser {
        CHROME,
        FIREFOX,
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void startDriver(Browser browser) {

        if (driver != null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador não suportado");
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By verificar_campo_email = By.id("user");
    private By clicar_link = By.linkText("Ainda não tem conta?");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void acessarTelaDeLogin() {
        driver.get("https://www.automationpratice.com.br/login");
        waitElementBePresent(verificar_campo_email, 20);
    }

    public void clicarLink() {
        driver.findElement(clicar_link).click();
    }
}

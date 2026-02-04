package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By verificar_criar_conta = By.linkText("Ainda não tem conta?");
    private By clicar_link = By.id("createAccount");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void acessarTelaDeLogin() {
        driver.get("https://www.automationpratice.com.br/login");
        waitElementBePresent(verificar_criar_conta, 20);
    }

    public void clicarLink() {
        driver.findElement(clicar_link).click();
    }
}

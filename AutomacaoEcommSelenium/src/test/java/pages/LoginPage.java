package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By verificar_criar_conta = By.linkText("Ainda não tem conta?");
    private By clicar_link = By.id("createAccount");


    public void acessarTelaDeLogin() {
        getDriver().get("https://www.automationpratice.com.br/login");
        Utils.waitElementBePresent(verificar_criar_conta, 20);
    }

    public void clicarLink() {
        getDriver().findElement(clicar_link).click();
    }
}

package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Utils extends RunCucumberTest {

    public void waitElementBePresent(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String gerarEmailAleatorio() {
        String email = "usuario" + System.currentTimeMillis() + "@teste.com";
        return email;
    }

    public String gerarSenhaAleatoria() {
        String senha = "Senha" + System.currentTimeMillis();
        return senha;
    }

    public String gerarNomeAleatorio() {
        String nome = "Nome" + System.currentTimeMillis();
        return nome;
    }
}



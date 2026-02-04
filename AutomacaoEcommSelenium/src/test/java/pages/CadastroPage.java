package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {



    private By nome_cadastro = By.id("user");
    private By email_cadastro = By.id("email");
    private By senha_cadastro = By.id("password");
    private By botao_cadastrar = By.id("btnRegister");


    public void preencherNome(String nome) {
        Utils.waitElementBePresent(nome_cadastro, 20);
        getDriver().findElement(nome_cadastro).sendKeys(nome);
    }

    public void preencherEmail(String email) {
        getDriver().findElement(email_cadastro).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(senha_cadastro).sendKeys(senha);
    }

    public void clicarBotaoCadastrar() {
        getDriver().findElement(botao_cadastrar).click();
    }

    public void validarMensagemSucesso() {
        Utils.waitElementBePresent(By.cssSelector(".swal2-confirm.swal2-styled"),20);
        String resultado_atual = getDriver().findElement(By.id("swal2-title")).getText();
        assert resultado_atual.equals("Cadastro realizado!");

    }
}

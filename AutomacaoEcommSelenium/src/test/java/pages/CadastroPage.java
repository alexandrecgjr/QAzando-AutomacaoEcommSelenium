package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By nome_cadastro = By.id("user");
    private By email_cadastro = By.id("email");
    private By senha_cadastro = By.id("password");
    private By botao_cadastrar = By.id("btnRegister");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;

    }

    public void preencherNome(String nome) {
        waitElementBePresent(nome_cadastro, 20);
        driver.findElement(nome_cadastro).sendKeys(nome);
    }

    public void preencherEmail(String email) {
        driver.findElement(email_cadastro).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(senha_cadastro).sendKeys(senha);
    }

    public void clicarBotaoCadastrar() {
        driver.findElement(botao_cadastrar).click();
    }

    public void validarMensagemSucesso() {
        waitElementBePresent(By.cssSelector(".swal2-confirm.swal2-styled"),20);
        String resultado_atual = driver.findElement(By.id("swal2-title")).getText();
        assert resultado_atual.equals("Cadastro realizado!");

    }
}

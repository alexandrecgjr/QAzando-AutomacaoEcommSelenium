package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {


CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^preencho os dados de cadastro$")
    public void preencho_os_dados_de_cadastro() {
        String nome = cadastroPage.gerarNomeAleatorio();
        String email = cadastroPage.gerarEmailAleatorio();
        String senha = cadastroPage.gerarSenhaAleatoria();

        cadastroPage.preencherNome(nome);
        cadastroPage.preencherEmail(email);
        cadastroPage.preencherSenha(senha);
    }

    @Quando("^clico no botão de registrar$")
    public void clico_no_botão_de_registrar() {
        cadastroPage.clicarBotaoCadastrar();
    }

    @Então("^vejo mensagem de sucesso de cadastro$")
    public void vejo_mensagem_de_sucesso_de_cadastro() {
        cadastroPage.validarMensagemSucesso();
    }

}

package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest{

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaDeLogin();
    }

    @E("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuario() {
       loginPage.clicarLink();
    }
}

package steps;

import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.HomePage;
import page.LoginPage;

import java.io.IOException;

public class LogjnSteps {


    @Dado("usuario acesse a plataforma")
    public void usuarioAcesseAPlataforma() {
//        loginPage.acessarPlataforma();
//        homePage = new HomePage(loginPage.driver);
    }

    @Quando("informar as credenciais validas")
    public void informarAsCredenciaisValidas() throws IOException {
        LoginPage loginPage = new LoginPage(Hook.driver);
        loginPage.informarCredenciais();
    }

    @Então("visualizaria a home da plataforma")
    public void visualizariaAHomeDaPlataforma() {
        HomePage homePage = new HomePage(Hook.driver);
        homePage.validarLoginSucesso();
    }

    @E("efetuara o logout com sucesso")
    public void efetuaraOLogoutComSucesso() {
        HomePage homePage = new HomePage(Hook.driver);
        homePage.efetuarLogout();
    }
}

package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.HomePage;
import page.LoginPage;

public class LogjnSteps {

    private LoginPage loginPage = new LoginPage();
    private HomePage homePage;

    @Dado("usuario acesse a plataforma")
    public void usuarioAcesseAPlataforma() {
        loginPage.acessarPlataforma();
        homePage = new HomePage(loginPage.driver);
    }

    @Quando("informar as credenciais validas")
    public void informarAsCredenciaisValidas() {
        loginPage.informarCredenciair();
    }

    @Então("visualizaria a home da plataforma")
    public void visualizariaAHomeDaPlataforma() {
        homePage.validarLoginSucesso();
    }

    @E("efetuara o logout com sucesso")
    public void efetuaraOLogoutComSucesso() {
        homePage.efetuarLogout();
    }
}

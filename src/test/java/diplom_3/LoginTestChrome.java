package diplom_3;

import diplom_3.pageobjects.ForgotPasswordPage;
import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.Test;

public class LoginTestChrome extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);
    ForgotPasswordPage objForgotPasswordPage = new ForgotPasswordPage(webDriver);

    // вход по кнопке «Войти в аккаунт» на главной,
    @Test
    public void mainPageEnterAccountTest() {
    }

    // вход через кнопку «Личный кабинет»,
    @Test
    public void mainPageTopEnterAccountTest() {
    }

    // вход через кнопку в форме регистрации,
    @Test
    public void registrationPageTest() {
    }

    // вход через кнопку в форме восстановления пароля.
    @Test
    public void forgetPasswordPageTest() {
    }
}
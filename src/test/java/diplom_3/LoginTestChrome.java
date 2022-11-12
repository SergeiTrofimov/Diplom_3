package diplom_3;

import diplom_3.helper.UserRegistration;
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


    // вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void mainPageEnterAccountTest() {
        UserRegistration user = userHelper.generateRandomUserCredentials(6);
        userHelper.apiUserRegistration(user);
        objMainPage.clickPersonalAccountEnterButton();
        // objLoginPage.inputLoginData(user.getUser().getEmail(),user.getUser().getPassword());
        objLoginPage.clickEnterButton();
        //userHelper.deleteUser(user.getUser());
    }

    // вход через кнопку «Личный кабинет»,
    @Test
    public void mainPageTopEnterAccountTest() {
        objMainPage.clickPersonalAccountTopButton();
    }

    // вход через кнопку в форме регистрации,
    @Test
    public void registrationPageTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.buttonEnterClick();
    }

    // вход через кнопку в форме восстановления пароля.
    @Test
    public void forgetPasswordPageTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickForgotPasswordLink();
        objForgotPasswordPage.clickRememberPasswordLink();
    }
}
package diplom_3;

import diplom_3.helper.UserRegistration;
import diplom_3.pageobjects.ForgotPasswordPage;
import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTestChrome extends BasicUITestChrome {
    UserRegistration user;
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);
    ForgotPasswordPage objForgotPasswordPage = new ForgotPasswordPage(webDriver);

    @Before
    public void registrationTestUser() {
        user = userHelper.generateRandomUserCredentials(6);
        userHelper.apiUserRegistration(user);
    }

    @After
    public void testCleanUp() {
        userHelper.deleteUser(user);
    }

    // вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void mainPageEnterAccountTest() {
        objMainPage.clickPersonalAccountEnterButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        assertEquals ("Кнопка не сменила название", "Оформить заказ",objMainPage.test());
    }

    // вход через кнопку «Личный кабинет»,
    @Test
    public void mainPageTopEnterAccountTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        assertEquals ("Кнопка не сменила название", "Оформить заказ",objMainPage.test());
    }

    // вход через кнопку в форме регистрации,
    @Test
    public void registrationPageTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        assertEquals ("Кнопка не сменила название", "Оформить заказ",objMainPage.test());
    }

    // вход через кнопку в форме восстановления пароля.
    @Test
    public void forgetPasswordPageTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickForgotPasswordLink();
        objForgotPasswordPage.clickRememberPasswordLink();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        assertEquals ("Кнопка не сменила название", "Оформить заказ",objMainPage.test());
    }
}
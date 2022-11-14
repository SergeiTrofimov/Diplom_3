package diplom_3;

import diplom_3.helper.UserRegistration;
import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

public class RegistrationChromeTest extends BasicUIChromeTest {
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);

    @Test
    @DisplayName("Успешная регистрацию")
    public void successRegistration() {
        UserRegistration user = userHelper.generateRandomUserCredentials(8);
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData(user.getName(), user.getEmail(), user.getPassword());
        objRegistrationPage.buttonRegistrationClick();
        assertTrue("Ошибка", objLoginPage.isButtonEnterIsDisplayed());
        userHelper.deleteUser(user);
    }

    @Test
    @DisplayName("Ошибку для некорректного пароля. Минимальный пароль — шесть символов")
    public void errorShortPassword() {
        UserRegistration user = userHelper.generateRandomUserCredentials(4);
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData(user.getName(), user.getEmail(), user.getPassword());
        objRegistrationPage.buttonRegistrationClick();
        assertTrue("Ошибка", objRegistrationPage.isPasswordErrorDisplayed());
    }
}
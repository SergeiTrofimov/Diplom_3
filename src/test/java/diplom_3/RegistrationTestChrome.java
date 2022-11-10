package diplom_3;

import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegistrationTestChrome extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);

    //Успешную регистрацию.
    @Test
    public void successRegistration() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData("name", "password@password.com", "pass");
        objRegistrationPage.buttonRegistrationClick();
        boolean success = objLoginPage.isButtonEnterIsDisplayed();
       // assertFalse("Ошибка", objRegistrationPage.isPasswordErrorDisplayed());
        assertTrue("Ошибка", objLoginPage.isButtonEnterIsDisplayed());
    }

    //Ошибку для некорректного пароля. Минимальный пароль — шесть символов.
    @Test
    public void errorShortPassword() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData("name", "password@password.com", "pass");
        objRegistrationPage.buttonRegistrationClick();
        assertTrue("Ошибка", objRegistrationPage.isPasswordErrorDisplayed());
    }
}
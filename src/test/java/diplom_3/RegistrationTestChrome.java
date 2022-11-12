package diplom_3;

import diplom_3.helper.UserRegistration;
import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.After;
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
        UserRegistration user = userHelper.generateRandomUserCredentials(8);
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData(user.getName(),user.getUser().getEmail(),user.getUser().getPassword());
        objRegistrationPage.buttonRegistrationClick();
        assertTrue("Ошибка", objLoginPage.isButtonEnterIsDisplayed());
        userHelper.deleteUser(user.getUser());
    }

    //Ошибку для некорректного пароля. Минимальный пароль — шесть символов.
    @Test
    public void errorShortPassword() {
        UserRegistration user = userHelper.generateRandomUserCredentials(4);
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData(user.getName(),user.getUser().getEmail(),user.getUser().getPassword());
        objRegistrationPage.buttonRegistrationClick();
        assertTrue("Ошибка", objRegistrationPage.isPasswordErrorDisplayed());
    }
}
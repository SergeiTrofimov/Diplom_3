package diplom_3;

import diplom_3.pageobjects.MainPage;
import diplom_3.pageobjects.LoginPage;
import diplom_3.pageobjects.RegistrationPage;
import org.junit.Test;

public class RegistrationTestChrome extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);

    //Успешную регистрацию.
    @Test
    public void canOrderScooter() {
        objMainPage.clickPersonalAccount();
        objLoginPage.clickRegistrationLink();
        objRegistrationPage.inputRegistrationData("name","password@password.com","pass");
        objRegistrationPage.buttonRegistrationClick();
    }
    //Ошибку для некорректного пароля. Минимальный пароль — шесть символов.
}

package diplom_3;


import diplom_3.pageobjects.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PersonalAccountTestChrome extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);
    ForgotPasswordPage objForgotPasswordPage = new ForgotPasswordPage(webDriver);
    PersonalAccountPage objPersonalAccount = new PersonalAccountPage(webDriver);

    //Проверь переход по клику на «Личный кабинет».
    @Test
    public void clickToPersonalAccountLinkTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData("svt@svt.com", "svt1234");
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        assertTrue("Ошибка", objPersonalAccount.isLogoutButtonIsDisplayed());
    }

    //Проверь переход по клику на «Конструктор» и на логотип Stellar Burgers.
    @Test
    public void clickToConstructorLink() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData("svt@svt.com", "svt1234");
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccount.clickConstructorLink();
        assertTrue("Ошибка", objMainPage.isBurgerTextIsDisplayed());
    }

    @Test
    public void clickToBurgerPicture() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData("svt@svt.com", "svt1234");
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccount.clickBurgerPicture();
        assertTrue("Ошибка", objMainPage.isBurgerTextIsDisplayed());
    }

    //Проверь выход по кнопке «Выйти» в личном кабинете.
    @Test
    public void clickLogOutTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData("svt@svt.com", "svt1234");
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccount.clickLogoutButton();
    }
}
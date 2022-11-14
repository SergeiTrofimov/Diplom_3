package diplom_3;

import diplom_3.helper.UserRegistration;
import diplom_3.pageobjects.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

public class PersonalAccountChromeTest extends BasicUIChromeTest {
    UserRegistration user;
    MainPage objMainPage = new MainPage(webDriver);
    LoginPage objLoginPage = new LoginPage(webDriver);
    RegistrationPage objRegistrationPage = new RegistrationPage(webDriver);
    ForgotPasswordPage objForgotPasswordPage = new ForgotPasswordPage(webDriver);
    PersonalAccountPage objPersonalAccountPage = new PersonalAccountPage(webDriver);

    @Before
    public void registrationTestUser() throws InterruptedException {
        user = userHelper.generateRandomUserCredentials(6);
        userHelper.apiUserRegistration(user);
    }

    @After
    public void testCleanUp() {
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccountPage.clickLogoutButton();
        userHelper.deleteUser(user);
    }

    @Test
    @DisplayName("Проверь переход по клику на «Личный кабинет».")
    public void clickToPersonalAccountLinkTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        assertTrue("Ошибка", objPersonalAccountPage.isLogoutButtonIsDisplayed());
    }

    @Test
    @DisplayName("Проверь переход по клику на «Конструктор».")
    public void clickToConstructorLink() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccountPage.clickConstructorLink();
        assertTrue("Ошибка", objMainPage.isBurgerTextIsDisplayed());
    }

    @Test
    @DisplayName("Проверь переход по клику на логотип Stellar Burgers.")
    public void clickToBurgerPicture() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
        objMainPage.clickPersonalAccountTopButton();
        objPersonalAccountPage.clickBurgerPicture();
        assertTrue("Ошибка", objMainPage.isBurgerTextIsDisplayed());
    }

    @Test
    @DisplayName("Проверь выход по логауту")
    public void clickLogOutTest() {
        objMainPage.clickPersonalAccountTopButton();
        objLoginPage.inputLoginData(user.getEmail(), user.getPassword());
        objLoginPage.clickEnterButton();
    }
}
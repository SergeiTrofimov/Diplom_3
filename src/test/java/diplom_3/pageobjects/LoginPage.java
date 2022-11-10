package diplom_3.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends MainPage {
    //Локаторы
    private By fieldEmailLoginPage = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input"); // Локатор поля "E-mail"
    private By fieldPasswordLoginPage = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input"); // Локатор поля "Пароль"
    private By buttonEnterLoginPage = By.className("button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa");
    private By registrationLinkLoginPage = By.xpath("//*[@id=\"root\"]/div/main/div/div/p[1]/a"); // Локатор ссылки регистрация

    //Конструктор
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Методы
    public void inputLoginData(String email, String password) { // метод, заполняющий текстовые поля разом
        driver.findElement(fieldEmailLoginPage).sendKeys(email);
        driver.findElement(fieldPasswordLoginPage).sendKeys(password);
    }

    public void clickRegistrationLink() {
        driver.findElement(registrationLinkLoginPage).click();
    }
    public boolean isButtonEnterIsDisplayed (){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonEnterLoginPage));
        boolean success = driver.findElement(buttonEnterLoginPage).isDisplayed();
        return success;
    }

}
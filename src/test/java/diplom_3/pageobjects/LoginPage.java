package diplom_3.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MainPage {
    //Локаторы
    private By fieldEmailLoginPage = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input"); // Локатор поля "E-mail"
    private By fieldPasswordLoginPage = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input"); // Локатор поля "E-mail"
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
}
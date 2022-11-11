package diplom_3.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Локаторы
public class MainPage extends MainAbstractPage {
    private By personalAccountTopButton = By.xpath("//*[@id=\"root\"]/div/header/nav/a/p"); // Локатор кнопки "Личный кабинет"
    private By personalAccountEnterButton = By.xpath("//*[@id=\"root\"]/div/main/section[2]/div/button");
    private By burgerText = By.xpath("//*[@id=\"root\"]/div/main/section[1]/h1");

    public MainPage(WebDriver driver) { // конструктор главной страницы
        super(driver);
    }

    //Методы
    public void clickPersonalAccountTopButton() { // кликаем кнопку "Личный кабинет"
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(personalAccountTopButton));
        driver.findElement(personalAccountTopButton).click();
    }

    public void clickPersonalAccountEnterButton() {
        driver.findElement(personalAccountEnterButton).click();
    }

    public boolean isBurgerTextIsDisplayed() {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(burgerText));
        boolean success = driver.findElement(burgerText).isDisplayed();
        return success;
    }
}
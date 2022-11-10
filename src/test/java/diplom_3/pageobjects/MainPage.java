package diplom_3.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Локаторы
public class MainPage extends MainAbstractPage{
    private By personalAccount = By.name("Личный Кабинет"); // Локатор кнопки "Личный кабинет"

    public MainPage(WebDriver driver) { // конструктор главной страницы
        super(driver);
    }

    //Методы
    public void clickPersonalAccount() { // кликаем кнопку "Личный кабинет"
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(personalAccount));
        driver.findElement(personalAccount).click();
    }
}
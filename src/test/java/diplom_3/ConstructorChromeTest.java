package diplom_3;

import diplom_3.pageobjects.MainPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

public class ConstructorChromeTest extends BasicUIChromeTest {
    MainPage objMainPage = new MainPage(webDriver);
// Конструктор

    //Проверь, что работают переходы к разделам
    // «Булки»,
    @Test
    @DisplayName("Переход на раздел булки")
    public void test() {
        objMainPage.clickMain();
        objMainPage.clickBun();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }

    // «Соусы»,
    @Test
    @DisplayName("Переход на раздел соусы")
    public void test1() {
        objMainPage.clickSauce();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }

    // «Начинки».
    @Test
    @DisplayName("Переход на раздел начинки")
    public void test3() {
        objMainPage.clickMain();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }
}
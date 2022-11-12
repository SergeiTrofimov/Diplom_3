package diplom_3;

import diplom_3.pageobjects.MainPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructorTestChrome extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
// Конструктор

    //Проверь, что работают переходы к разделам:
    // «Булки»,
    @Test
    public void test() {
        objMainPage.clickMain();
        objMainPage.clickBun();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }

    // «Соусы»,
    @Test
    public void test1() {
        objMainPage.clickSauce();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }

    // «Начинки».
    public void test3() {
        objMainPage.clickMain();
        assertTrue("Ошибка", objMainPage.isSelectedConstructorIsDisplayed());
    }
}
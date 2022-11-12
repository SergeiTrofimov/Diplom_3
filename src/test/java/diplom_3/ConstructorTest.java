package diplom_3;

import diplom_3.pageobjects.MainAbstractPage;
import diplom_3.pageobjects.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static diplom_3.BasicUITestChrome.webDriver;

public class ConstructorTest extends BasicUITestChrome {
    MainPage objMainPage = new MainPage(webDriver);
// Конструктор

    //Проверь, что работают переходы к разделам:
    // «Булки»,
    @Test
    public void test(){
        objMainPage.clickMain();
        objMainPage.clickBun();
    }
    // «Соусы»,
    public void test1(){
        objMainPage.clickSauce();
    }
    // «Начинки».
    public void test3(){
        objMainPage.clickMain();
    }
}

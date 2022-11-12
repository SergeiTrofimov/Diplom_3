package diplom_3;

import diplom_3.helper.UserHelper;
import diplom_3.pageobjects.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicUITestChrome {
    protected static WebDriver webDriver;
    protected static UserHelper userHelper = new UserHelper();

    @BeforeClass
    public static void setup() // приведения систмы в првоначальное состояние
    {
        WebDriverManager.chromedriver().setup(); // инициализируем драйвер под хром
        webDriver = new ChromeDriver(); // создаем объект драйвера под хром
        webDriver.get(Constants.hostname); // открываем страницу
        MainPage objMainPage = new MainPage(webDriver);
    }

    @AfterClass
    public static void teardown() {
        // Закрой браузер
        webDriver.quit();
    }
}
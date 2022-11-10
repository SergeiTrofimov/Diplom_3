package diplom_3;

import diplom_3.pageobjects.MainPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegistrationTestChrome extends BasicUITestChrome {
   MainPage mainPage = new MainPage(webDriver);

    //Успешную регистрацию.
    @Test
    public void canOrderScooter() {



    }
    //Ошибку для некорректного пароля. Минимальный пароль — шесть символов.
}

package diplom_3.helper;

import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import static diplom_3.Constants.*;
import static io.restassured.RestAssured.given;

public class UserHelper {

    public UserRegistration generateRandomUserCredentials(int passwordLength) {
        String name = RandomStringUtils.randomAlphabetic(8);
        String email = RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(4) + ".com";
        String password = RandomStringUtils.randomAlphabetic(passwordLength);
        UserRegistration userRegistration = new UserRegistration(email,password, name);
        return userRegistration;
    }

    public User apiUserRegistration(UserRegistration userRegistration) {
        given().log().all()
                .header("Content-type", "application/json")
                .baseUri(hostname)
                .body(userRegistration)
                .when()
                .post(REGISTER_USER).then().statusCode(200);
        User user = new User(userRegistration.getEmail(),userRegistration.getPassword());
        return user;
    }

    public void deleteUser(User user) {
        // Логинимся пользователем
        Response response = given().log().all()
                .header("Content-type", "application/json")
                .baseUri(hostname)
                .body(user)
                .when()
                .post(USER_LOGIN);
        //Удаляем пользователя
        given().log().all()
                .header("authorization", response.getBody().as(LoginUserResponse.class).getAccessToken())
                .header("Content-type", "application/json")
                .baseUri(hostname)
                .when()
                .delete(USER_RUD).then().statusCode(202);
    }
}
package diplom_3.helper;

import org.apache.commons.lang3.RandomStringUtils;

public class UserHelper {
    public class UserCredentialsGenerator {
        public UserCredentials generateRandomUserCredentials(int passwordLength) {
            String name = RandomStringUtils.randomAlphabetic(8);
            String email = RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(4) + ".com";
            String password = RandomStringUtils.randomAlphabetic(passwordLength);
            UserCredentials user = new UserCredentials(name, email, password);
            return user;
        }
    }
}
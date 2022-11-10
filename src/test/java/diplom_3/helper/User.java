package diplom_3.helper;

public class User {
    String email;
    String password;

    // Конструктор
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //Getter
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
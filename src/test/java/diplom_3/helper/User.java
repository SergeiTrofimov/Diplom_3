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
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
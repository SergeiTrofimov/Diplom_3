package diplom_3.helper;

public class UserCredentials {
    //Переменные
    private String name;
    private String email;
    private String password;

    //Конструктор
    public UserCredentials(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
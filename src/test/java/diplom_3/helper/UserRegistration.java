package diplom_3.helper;

public class UserRegistration {
    //Переменные
    User user;
    private String name;

    //Конструктор
    public UserRegistration(User user, String name) {
        this.user = user;
        this.name = name;
    }

    //Геттеры
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
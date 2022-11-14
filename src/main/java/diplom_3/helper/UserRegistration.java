package diplom_3.helper;

public class UserRegistration extends User {
    //Переменные
    private String name;

    //Конструктор
    public UserRegistration(String email, String password, String name) {
        super(email, password);
        this.name = name;
    }

    //Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
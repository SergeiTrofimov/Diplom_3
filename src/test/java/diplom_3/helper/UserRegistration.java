package diplom_3.helper;

public class UserRegistration extends User{




    public void setName(String name) {
        this.name = name;
    }

    //Переменные
    private String name;

    //Конструктор
    public UserRegistration(String email, String password, String name) {
        super(email, password);
        this.name = name;
    }

    //Геттеры
    public String getName() {
        return name;
    }
}
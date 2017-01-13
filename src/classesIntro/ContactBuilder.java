package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
// Пример паттерна Builder
public class ContactBuilder {
    // обязательный параметр
    private final String surname;
    // дополнительные параметры
    // инициализируются значениями по умолчанию
    private String name = "нет";
    private String email = "нет";
    private String phone = "нет";
    private String address = "нет";

    public ContactBuilder(String surname) {
        this.surname = surname;
    }

    public ContactBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Contact bulid() {
        return new Contact(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

}
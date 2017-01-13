package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes014 {

    public static void main(String[] args) {
        // Пример паттерна Builder
        Contact contact1 = new ContactBuilder("Пуркин")
                .phone("123")
                .name("Вася")
                .address("Уфа")
                .email("v@p.ru")
                .bulid();
        System.out.println("contact1 name = " + contact1.getName());
        System.out.println("contact1 surname = " + contact1.getSurname());
        System.out.println("contact1 email = " + contact1.getEmail());
        System.out.println("contact1 phone = " + contact1.getPhone());
        System.out.println("contact1 adress = " + contact1.getAddress());
        System.out.println("---------------");
        Contact contact2 = new ContactBuilder("Пупкин")
                .phone("456")
                .name("Вася")
                .bulid();
        System.out.println("contact2 name = " + contact2.getName());
        System.out.println("contact2 surname = " + contact2.getSurname());
        System.out.println("contact2 email = " + contact2.getEmail());
        System.out.println("contact2 phone = " + contact2.getPhone());
        System.out.println("contact2 adress = " + contact2.getAddress());
    }

}
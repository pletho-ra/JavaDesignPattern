package Copy;

import Copy.ShallowCopy.Address;
import Copy.ShallowCopy.Person;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Newyork");
        Person person1 = new Person("Raja", address);

        Person person2 = (Person) person1.clone();

        System.out.println(person1.address.city);
        System.out.println(person2.address.city);

        person2.address.city = "Los Angeles";

        System.out.println(person1.address.city);
        System.out.println(person2.address.city);

    }
}

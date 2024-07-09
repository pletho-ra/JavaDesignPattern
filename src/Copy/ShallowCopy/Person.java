package Copy.ShallowCopy;

public class Person implements Cloneable{
    String name;
    public Address address;
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // shallow copy of the person1 and assigned to new person object
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }
}

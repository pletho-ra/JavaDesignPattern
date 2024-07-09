package Copy.ShallowCopy;

public class Address implements Cloneable{
    public String city;
    public Address(String city){
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return new Address(this.city);
    }
}

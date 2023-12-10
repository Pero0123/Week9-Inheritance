package ie.atu;
import java.util.Scanner;
public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructors
    public Person() {
        // Default constructor
    }

    public Person(String name, String address, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
//accessors
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
//mutators
public void setName(String name) {
    this.name = name;
}

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

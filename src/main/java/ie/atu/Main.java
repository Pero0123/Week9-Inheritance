package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John","123 main", "083111111");

        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getPhoneNumber());

        // Modifying fields using mutator methods
        person1.setName("dave");
        person1.setAddress("321 main");
        person1.setPhoneNumber("089333333");

        System.out.println("\nupdated information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getPhoneNumber());
        }
    }
package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Main method (just for testing)
    public static void main(String[] args) {
        // Creating an instance of Customer
        Customer customer1 = new Customer("John Doe", "123 Main St", "555-1234", 1001, true);

        // Accessing fields using accessor methods from both Person and Customer
        System.out.println("Name: " + customer1.getName());
        System.out.println("Address: " + customer1.getAddress());
        System.out.println("Phone Number: " + customer1.getPhoneNumber());
        System.out.println("Costomer Number: " + customer1.getCustomerNumber());
        System.out.println("is on Mailing List: " + customer1.isOnMailingList());

        // Modifying fields using mutator methods from both Person and Customer
        customer1.setName("Jane");
        customer1.setAddress("456 strret");
        customer1.setPhoneNumber("5555678");
        customer1.setCustomerNumber(102);
        customer1.setOnMailingList(false);

        // Displaying updated information
        System.out.println("\nupdated Information:");
        System.out.println("Name: " + customer1.getName());
        System.out.println("Address: " + customer1.getAddress());
        System.out.println("Phone Number: " + customer1.getPhoneNumber());
        System.out.println("Customer Number: " + customer1.getCustomerNumber());
        System.out.println("is On Mailing List: " + customer1.isOnMailingList());
    }
}
package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {
        // Constructing the object using the five-parameter constructor
        Customer customerPart1 = new Customer("Pero", "Galway", "888777666", 676, true);

        System.out.println("Customer Part1:");
        System.out.printf("Name: %s%n", customerPart1.getName());
        System.out.printf("Address: %s%n", customerPart1.getAddress());
        System.out.printf("Phone Number: %s%n", customerPart1.getPhoneNumber());
        System.out.printf("Customer Number: %d%n", customerPart1.getCustomerNumber());
        System.out.printf("On Mailing List: %b%n", customerPart1.isOnMailingList());

        Customer customerPart2 = new Customer();

        customerPart2.setName("Part 2");
        customerPart2.setAddress("Limerick");
        customerPart2.setCustomerNumber(5554);
        customerPart2.setPhoneNumber("444333555");
        customerPart2.setOnMailingList(true);

        System.out.println("Name: "+customerPart2.getName());
        System.out.println("Address "+customerPart2.getAddress());
        System.out.println("Customer Number: "+customerPart2.getCustomerNumber());
        System.out.println("Phone Number "+ customerPart2.getPhoneNumber());
        System.out.println("Is on mailing list: "+ customerPart2.isOnMailingList());

    }
}
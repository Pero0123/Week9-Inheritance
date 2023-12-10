package ie.atu;

public class Customer extends Person{
    private int customerNumber;
    private boolean onMailingList;

    //constructor
    public Customer(){

    }

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean onMailingList)
    {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    //accessors
    public int getCustomerNumber(){
        return customerNumber;
    }

    public boolean isOnMailingList(){
        return onMailingList;
    }

    //mutators
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList){
        this.onMailingList=onMailingList;
    }

}

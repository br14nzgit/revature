public class Customer {
    String customerName = "Amanda";

    public Customer() {
        String customerName = "Daniel";
    }
    public Customer(String cName) {
        this.customerName = cName;
    }
    public void changeName() {
        customerName = "Andrew";
    }


    public static void main(String[] args) {
        Customer cust1 = new Customer("Chis");

        System.out.println(cust1.customerName);
        cust1.changeName();
        Customer cust2 = new Customer();
        System.out.println(cust2.customerName);
    }
}
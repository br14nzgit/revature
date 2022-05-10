public class Product {
   // initialize

     public static int noOfObjects;

    int productID;
    String productName;
    int quantity;
    int price;
    {
        productID = -1;
        productName = "NA";
        quantity = -1;
        price = -1;
        noOfObjects++;
    }
    static{
        System.out.println("Welcome");
    }


    public Product(int productID, String productName, int quantity, int price) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public Product(){
        productID = 100;
        productName = "Lakme";
        quantity = 100;
        price = 90;
    }
    public int calculateBill(Product product){
        int sum = 0;
        sum = product.quantity * product.price;
        return sum;
    }

    public static void main(String[] args) {
        int sum=0;
        Product product1 = new Product();
        sum = product1.calculateBill(product1);
        System.out.println(product1.productName+ " bill is :"+ sum);

        Product product2 = new Product(201, "Aroma", 900, 899);
        sum = product2.calculateBill(product2);
        System.out.println(product2.productName+ " bill is :"+sum);

        Product product3 = new Product(202, "Pendrive", 877, 99);
        sum = product3.calculateBill(product3);
        System.out.println(product3.productName+ " bill is :"+sum);

        System.out.println("Total products: " + noOfObjects);
    }
}

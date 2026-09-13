public class Customer {
     private int customerId;
     private String name;

     public Customer(int customerId, String name) {
         this.customerId = customerId;
         this.name = name;
     }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer name: " + name);
    }


}



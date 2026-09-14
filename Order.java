public class Order {

    OrderItem[] orderItems = new OrderItem[5];
    int itemsCount = 0;

    public void addOrderItem(OrderItem orderItem) {


        if (itemsCount < 5) {
            orderItems[itemsCount] = orderItem;
            itemsCount++;
        } else {
            System.out.println("Not added, order is full.");
        }
    }


    private int orderId;
    private Customer customer;


    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }


    public void displayInfo() {

        for (int i = 0; i < itemsCount; i++) {
            System.out.println("\nMENU: " + (1 + i));
            orderItems[i].displayInfo();
        }
    }

    public double calculateTotal() {

        double total = 0;

            for (int i = 0; i < itemsCount; i++) {
                double priceFound = orderItems[i].getMenuItem().getPrice();
                int quantity = orderItems[i].getQuantity();
                total += priceFound * quantity;
            }
        return total;
    }
}

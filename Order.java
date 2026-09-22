public class Order {

    OrderItem[] orderItems = new OrderItem[5];
    int itemsCount = 0;

    public void addOrderItem(OrderItem orderItem) {

        if (itemsCount >= 5) {
            System.out.println("Not added, order is full.");
        } else if (orderItem.getQuantity() <= 0) {
            System.out.println("Not added, quantity should be greater than 0.");
        } else {
            orderItems[itemsCount] = orderItem;
            itemsCount++;
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

        System.out.println("ORDER ID: " + getOrderId());
        System.out.println("CUSTOMER: " + getCustomer().getName());
        for (int i = 0; i < itemsCount; i++) {
            System.out.println("\nMENU: " + (1 + i));
            orderItems[i].displayInfo();
        }
        System.out.println("TOTAL: " + calculateTotal());
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

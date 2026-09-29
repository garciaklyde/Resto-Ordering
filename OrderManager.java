public class OrderManager {

    Order[] orders = new Order[5];
    int ordersCount = 0;

    public void addOrder(Order order) {
        if (ordersCount < 5) {
            orders[ordersCount] = order;
            ordersCount++;
        } else {
            System.out.println("Order manager is already full");
        }
    }

    public void displayOrders() {
        for (int i = 0; i < ordersCount; i++) {
            System.out.println("\nOrder: " + (i + 1));
            orders[i].displayInfo();
        }
    }

    public Order findOrder(int orderId) {
        for (int i = 0; i < ordersCount; i++) {
            if (orders[i].getOrderId() == orderId) {
                return orders[i];
            }
        }
        return null;
    }
}

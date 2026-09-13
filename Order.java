public class Order {

    MenuItem[] menus = new MenuItem[5];
    int menusCount = 0;

    public void addMenu(MenuItem menuItem) {
        menus[menusCount] = menuItem;
        menusCount++;
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
        System.out.println("Order ID: " + orderId);
        customer.displayInfo();
    }
}

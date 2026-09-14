public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void displayInfo() {
        menuItem.displayInfo();
        System.out.println("Quantity: " + quantity);
    }
}

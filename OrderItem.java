public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity should be greater than 0.");
        }
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

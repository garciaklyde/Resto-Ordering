public class MenuItem {

    private int itemId;
    private String name;
    private double price;
    private boolean available;

    public MenuItem(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        available = true;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item name: " + name);
        System.out.println("Item price: " + price);

        if (available) {
            System.out.println("Item is currently available.");
        } else {
            System.out.println("Item is currently unavailable.");
        }
    }


}

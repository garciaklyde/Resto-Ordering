public class Main {
    public static void main(String[] args) {


        Customer klyde = new Customer(100, "Klyde Garcia");
        Order order = new Order(100, klyde);
        OrderManager orderManager = new OrderManager();
        MenuManager menuManager = new MenuManager();

        MenuItem pizza = new MenuItem(100, "Pizza", 89);
        MenuItem chicken = new MenuItem(101, "Chicken", 150);
        MenuItem cheesecake = new MenuItem(102, "Cheesecake", 59);


        OrderItem orderitem = new OrderItem(pizza, 2);
        OrderItem orderitem2 = new OrderItem(chicken, 1);
        OrderItem orderitem3 = new OrderItem(cheesecake, 3);
        OrderItem orderitem4 = new OrderItem(cheesecake, 3);
        OrderItem orderitem5 = new OrderItem(cheesecake, 3);
        OrderItem orderitem6 = new OrderItem(cheesecake, 3);

        order.addOrderItem(orderitem);
        order.addOrderItem(orderitem2);
        order.addOrderItem(orderitem3);
        order.addOrderItem(orderitem4);
        order.addOrderItem(orderitem5);
        order.addOrderItem(orderitem6);

        orderManager.addOrder(order);

        menuManager.addMenuItem(pizza);
        menuManager.addMenuItem(chicken);
        menuManager.addMenuItem(cheesecake);
        menuManager.addMenuItem(pizza);
        menuManager.addMenuItem(pizza);
        menuManager.addMenuItem(pizza);

        System.out.println("\n======== ALL MENUS ========");
        menuManager.displayMenuItems();

        System.out.println("\n======== Menu Item: 100 ========");
        MenuItem test = menuManager.findMenuItem(100);

        test.displayInfo();

        System.out.println("\n======== Menu Item: 200 ========");
        MenuItem tryFind = menuManager.findMenuItem(200);

        if (tryFind == null) {
            System.out.println("Item not found.");
        } else {
            tryFind.displayInfo();
        }





    }
}

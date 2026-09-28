public class Main {
    public static void main(String[] args) {


        Customer klyde = new Customer(100, "Klyde Garcia");
        Order order = new Order(100, klyde);

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

        order.displayInfo();

    }
}

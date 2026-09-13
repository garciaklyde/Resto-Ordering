public class Main {
    public static void main(String[] args) {

        MenuItem pizza = new MenuItem(100, "Pizza", 89);
        MenuItem chicken = new MenuItem(101, "Chicken", 150);
        MenuItem cheesecake = new MenuItem(102, "Cheesecake", 59);

        Customer klyde = new Customer(100, "Klyde Garcia");
        Customer keanne = new Customer(101, "Keanne Garcia");

        klyde.displayInfo();
        keanne.displayInfo();

        Order klydeOrder = new Order(100, klyde);
        klydeOrder.displayInfo();
    }
}
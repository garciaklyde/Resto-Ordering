public class MenuManager {

    MenuItem[] menus = new MenuItem[5];
    int menusCount = 0;

    public void addMenuItem(MenuItem menuItem) {

        if (menusCount < 5) {
            menus[menusCount] = menuItem;
            menusCount++;
        } else {
            System.out.println("Menu is already full.");
        }
    }

    public void displayMenuItems() {

        for (int i = 0; i < menusCount; i++) {
            System.out.println("\nMenu: " + (i + 1));
            menus[i].displayInfo();
        }
    }

    public MenuItem findMenuItem(int itemId) {
        for (int i = 0; i < menusCount; i++) {
            if (menus[i].getItemId() == itemId) {
                return menus[i];
            }
        }
        return null;
    }
}

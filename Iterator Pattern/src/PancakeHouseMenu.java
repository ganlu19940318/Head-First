import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList <MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("regular pancake breakfast", "pancakes with fried eggs, sausage", false, 2.99);
        addItem("KB's pancake breakfast", "pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("blueberry pancakes", "pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int size;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        size = menuItems.size();
    }

    @Override
    public boolean hashNext() {
        if(position >= size){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}

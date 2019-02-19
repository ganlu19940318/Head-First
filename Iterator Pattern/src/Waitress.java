public class Waitress {
    Menu dinerMenu;
    Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("Menu breakfast");
        printMenu(pancakeIterator);

        System.out.println("Menu lunch");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hashNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }
}

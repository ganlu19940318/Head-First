public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("NY");
        System.out.println("First: " + pizza.getName());

        System.out.println("====================================");

        Pizza pizza2 = chicagoPizzaStore.orderPizza("Chicago");
        System.out.println("Second: "+ pizza2.getName());
    }
}

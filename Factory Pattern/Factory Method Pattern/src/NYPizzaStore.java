public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("NY".equals(type)){
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("Chicago".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}

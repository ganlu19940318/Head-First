public class Sugar extends Food {
    private Food food;

    public Sugar(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return 0.3 + food.cost();
    }
}

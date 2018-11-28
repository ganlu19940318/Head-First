public class Salt extends Food {
    private Food food;

    public Salt(Food food) {
        this.food = food;
    }

    @Override
    public double cost() {
        return 0.2 + food.cost();
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Salt";
    }
}

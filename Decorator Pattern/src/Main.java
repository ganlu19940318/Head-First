public class Main {

    public static void main(String[] args) {
        Food food = new Dumpling();
        System.out.println("food:" + food.getDescription() + ". cost:" + food.cost());

        food = new Salt(food);
        System.out.println("food:" + food.getDescription() + ". cost:" + food.cost());

        food = new Sugar(food);
        System.out.println("food:" + food.getDescription() + ". cost:" + food.cost());

        Food food2 = new Noodle();
        System.out.println("food2:" + food2.getDescription() + ". cost2:" + food2.cost());

        food2 = new Sugar(food2);
        food2 = new Sugar(food2);
        food2 = new Salt(food2);
        System.out.println("food2:" + food2.getDescription() + ". cost2:" + food2.cost());
    }
}

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
        duck.quack();

        System.out.println("=====================");

        Duck duck2 = new ModelDuck();
        duck2.display();
        duck2.fly();
        duck2.quack();
        duck2.setQuackBehavior(new MuteQuack());
        duck2.quack();
    }
}

public class TypeAPersonFactory implements PersonFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }

    @Override
    public Breakfirst getBreakfirst() {
        return new Tea();
    }
}

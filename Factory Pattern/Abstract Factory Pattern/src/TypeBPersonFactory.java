public class TypeBPersonFactory implements PersonFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }

    @Override
    public Breakfirst getBreakfirst() {
        return new Milk();
    }
}

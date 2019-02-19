public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}

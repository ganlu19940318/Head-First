public class TestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}

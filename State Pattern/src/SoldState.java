public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry, you can not turn the crank twice");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        System.out.println("Here is your candy");
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

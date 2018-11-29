public class Day {
    PersonFactory personFactory;

    public Day(PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

    public void begin(){
        System.out.println("开始新一天");
        personFactory.getCar().gotowork();
        personFactory.getBreakfirst().eat();
    }
}

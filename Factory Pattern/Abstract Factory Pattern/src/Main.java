public class Main {

    public static void main(String[] args) {

        PersonFactory typeAPersonFactory = new TypeAPersonFactory();
        Day day = new Day(typeAPersonFactory);
        day.begin();

        System.out.println("=========================");

        PersonFactory typeBPersonFactory = new TypeBPersonFactory();
        Day day2 = new Day(typeBPersonFactory);
        day2.begin();
    }
}

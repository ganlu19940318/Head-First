public class SingletonTwo {
    private static SingletonTwo uniqueInstance = new SingletonTwo();

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance(){
        return uniqueInstance;
    }
}

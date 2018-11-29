public class SingletonOne {

    private static SingletonOne uniqueInstance;

    private SingletonOne(){}

    public static synchronized SingletonOne getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonOne();
        }
        return uniqueInstance;
    }
}

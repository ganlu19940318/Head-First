public class SingletonThree {
    private volatile static SingletonThree uniqueInstance;

    private SingletonThree() {
    }

    public static SingletonThree getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonThree.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonThree();
                }
            }
        }
        return uniqueInstance;
    }
}

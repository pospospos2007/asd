package 创建型.单例;

/**
 * Created by mac on 4/30/18.
 */
public class LazySingleton {
    private static LazySingleton uniqueInstance = null;
    private int data = 0;
    /**
     * Returns a reference to the single instance. Creates the
     instance if it
     * does not yet exist. (This is called lazy instantiation.)
     */
    public    static   LazySingleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new LazySingleton();
        return uniqueInstance;
    }
    /**
     * The Singleton Constructor. Note that it is private! No client
     can
     * instantiate a Singleton object directly!
     */
    private LazySingleton() {
    }



}

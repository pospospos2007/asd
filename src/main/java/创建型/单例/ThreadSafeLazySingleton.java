package 创建型.单例;

/**
 * Created by mac on 4/30/18.
 *
 *  Double Check Locking
 */
public class ThreadSafeLazySingleton {
    volatile private  static ThreadSafeLazySingleton uniqueInstance = null;

    private int data = 0;

    public  static ThreadSafeLazySingleton getInstance() {
        try {
            if (uniqueInstance == null) {
                Thread.sleep(200);

                synchronized (ThreadSafeLazySingleton.class) {
                    if (uniqueInstance == null)
                        uniqueInstance = new ThreadSafeLazySingleton();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return uniqueInstance;
    }

    private ThreadSafeLazySingleton() {
    }



}

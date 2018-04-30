package 创建型.单例;

/**
 * Created by mac on 4/30/18.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance().hashCode());
    }

    public static void main(String[] args) {

        MyThread[] mts = new MyThread[12];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
}

package p2;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s start thread... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finish thread... \n", Thread.currentThread().getName());
    }
}

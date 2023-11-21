package p4;

import p3.MyThread;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Runnable runnable = () -> {
            System.out.printf("%s start thread... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s finish thread... \n", Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable, "MyThread");
        thread.start();
        System.out.println("Main thread finish...");
    }

}

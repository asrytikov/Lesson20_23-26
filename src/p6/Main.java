package p6;

import p5.ActiveThread;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MThread mThread = new MThread("MThread");
        mThread.start();

        try{
            Thread.sleep(150);
            mThread.interrupt();
            Thread.sleep(150);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finish...");
    }
}

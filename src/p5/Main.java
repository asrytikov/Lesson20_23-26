package p5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        ActiveThread activeThread = new ActiveThread();
        Thread thread = new Thread(activeThread, "MyThread");
        thread.start();

        try{
            Thread.sleep(1600);
            activeThread.disable();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finish...");
    }
}

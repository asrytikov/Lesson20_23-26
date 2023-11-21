package p2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");
        for(int i=1; i<=5; i++) {
            MyThread thread = new MyThread("MyThread " + i);
            thread.start();
            thread.join();
        }
        System.out.println("Main thread finish...");
    }
}

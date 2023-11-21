package p3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread thread = new Thread(new MyThread(), "MyThread");
        thread.start();
        System.out.println("Main thread finish...");
    }
}

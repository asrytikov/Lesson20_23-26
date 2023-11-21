package p6;

public class MThread extends Thread{

    public MThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s start thread... \n", Thread.currentThread().getName());
        int counter = 1;
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Counter: " + counter++);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                //e.printStackTrace();
                //interrupt();
            }
        }
        System.out.printf("%s finish thread... \n", Thread.currentThread().getName());
    }
}

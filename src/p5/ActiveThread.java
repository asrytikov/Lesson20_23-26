package p5;

public class ActiveThread implements Runnable{

    private boolean isAct;
    void disable(){
        isAct=false;
    }

    public ActiveThread(){
        isAct = true;
    }

    @Override
    public void run() {
        System.out.printf("%s start thread... \n", Thread.currentThread().getName());
        int counter = 1;
        while (isAct){
            System.out.println("Counter: " + counter++);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%s finish thread... \n", Thread.currentThread().getName());
    }
}

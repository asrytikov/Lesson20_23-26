package p8;

public class ResThread implements Runnable{
    Res res;

    public ResThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
       res.increment();
    }
}

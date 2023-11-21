package p9;

public class Wallet {

    private int countMoney = 0;

    public synchronized void put(){
        while (countMoney>=3){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        countMoney++;
        System.out.println("Parent put 1 money");
        System.out.println("Money in wallet: " + countMoney);
        notify();
    }
    public synchronized void get(){
        while (countMoney<1){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        countMoney--;
        System.out.println("Child get 1 money");
        System.out.println("Money in wallet: " + countMoney);
        notify();
    }

}

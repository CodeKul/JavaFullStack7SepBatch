package multithreading;

public class ThreadYieldOne extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("in t1");
            Thread.yield();

        }
    }
}

class ThreadYieldTwo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("in t2");
        }
    }
}

class ThreadImpl{
    public static void main(String[] args) {
        ThreadYieldOne t1 = new ThreadYieldOne();
        ThreadYieldTwo t2 = new ThreadYieldTwo();

        t1.start();
        t2.start();

    }
}
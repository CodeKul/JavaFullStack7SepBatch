package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=1;i<=10;i++) {
            ThreadPoolOne t1 = new ThreadPoolOne(i);
            executorService.execute(t1);
        }
        executorService.shutdown();
    }
}

class ThreadPoolOne extends Thread{
    private final int n;

    ThreadPoolOne(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Start "+n);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"End "+n);

    }
}
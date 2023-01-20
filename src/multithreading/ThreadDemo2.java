package multithreading;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}

class ThreadImpl2 {
    public static void main(String[] args) {
        ThreadDemo2 th1 = new ThreadDemo2();
        Thread thread = new Thread(th1);
        thread.start();
    }
}
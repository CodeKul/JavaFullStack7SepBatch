package multithreading;

public class ThreadRunDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Current Thread "+Thread.currentThread().getName());
        System.out.println("in run method");
    }

    public static void main(String[] args) {
        ThreadRunDemo threadRunDemo = new ThreadRunDemo();
        Thread thread = new Thread(threadRunDemo);
        thread.run();
    }
}

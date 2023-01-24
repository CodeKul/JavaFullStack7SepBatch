package multithreading;

public class ThreadNameDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("in run method");
    }
}

class ThreadNameImpl {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadNameDemo th1 = new ThreadNameDemo();
        ThreadNameDemo th2 = new ThreadNameDemo();
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2,"Play VLC");

        t1.start();
        t2.start();
        t1.setName("to check grammar");
        System.out.println("t1 "+t1.getName());
        System.out.println("t2 "+t2.getName());
    }
}

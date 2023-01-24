package multithreading;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}
class DaemonThreadImpl{
    public static void main(String[] args) {
        DaemonThreadDemo th1 = new DaemonThreadDemo();
        DaemonThreadDemo th2 = new DaemonThreadDemo();
        th1.setDaemon(true);
        th1.start();
        th2.start();
        System.out.println(th1.isDaemon());
        System.out.println(th2.isDaemon());
    }
}

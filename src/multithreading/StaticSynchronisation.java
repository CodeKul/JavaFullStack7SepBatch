package multithreading;

public class StaticSynchronisation {
     synchronized static void  printTable(int no){
        for (int i=1;i<=10;i++) {
            System.out.println(no * i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class StaticThread1 extends Thread{

    @Override
    public void run() {
        StaticSynchronisation.printTable(5);
    }
}
class StaticThread2 extends Thread{

    @Override
    public void run() {
        StaticSynchronisation.printTable(3);
    }
}

class StaticThread3 extends Thread{

    @Override
    public void run() {
        StaticSynchronisation.printTable(2);
    }
}

class StaticThread4 extends Thread{

    @Override
    public void run() {
        StaticSynchronisation.printTable(4);
    }
}
class StaticPrintTableImpl{
    public static void main(String[] args) {
        StaticThread1 thread1 = new StaticThread1();
        StaticThread2 thread2 = new StaticThread2();
        StaticThread3 thread3 = new StaticThread3();
        StaticThread4 thread4 = new StaticThread4();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

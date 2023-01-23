package multithreading;

public class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
      //  System.out.println("in run method");
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Current Thread -"+Thread.currentThread().getName());
        }
    }
}
class ThreadJoinImpl{
    public static void main(String[] args) {
        ThreadJoinDemo th1 = new ThreadJoinDemo();
        ThreadJoinDemo th2 = new ThreadJoinDemo();
        ThreadJoinDemo th3 = new ThreadJoinDemo();
        th1.start();

        try {
            System.out.println("Current Thread - " + Thread.currentThread());
            th1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current Thread - " + Thread.currentThread());
        th2.start();
        try {
            th2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        th3.start();
    }
}

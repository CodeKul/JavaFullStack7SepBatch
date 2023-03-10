package java8;


public class RunnableDemo {
    public static void main(String[] args) {
       Thread thread = new Thread(new Runnable(){
           @Override
           public void run() {
               System.out.println("in run method");
           }
       });
       thread.start();

       //lambda ex

        Thread thread1 = new Thread(() -> {
            System.out.println("in lambda run method");
        });
        thread1.start();
    }
}

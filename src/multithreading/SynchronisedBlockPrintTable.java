package multithreading;
//synchronised block
public class SynchronisedBlockPrintTable {
     void  printTable(int no) {
         synchronized (this) {
             for (int i = 1; i <= 10; i++) {
                 System.out.println(no * i);
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     }
}
class ThreadOne extends Thread{
    SynchronisedBlockPrintTable printTable;
    ThreadOne(SynchronisedBlockPrintTable printTable){
        this.printTable = printTable;
    }
    @Override
    public void run() {
        printTable.printTable(5);
    }
}
class ThreadTwo extends Thread{
    SynchronisedBlockPrintTable printTable;
    ThreadTwo(SynchronisedBlockPrintTable printTable){
        this.printTable = printTable;
    }
    @Override
    public void run() {
        printTable.printTable(3);
    }
}
class SPrintTableImpl{
    public static void main(String[] args) {
        SynchronisedBlockPrintTable printTable = new SynchronisedBlockPrintTable();

        ThreadOne thread1 = new ThreadOne(printTable);
        ThreadTwo thread2 = new ThreadTwo(printTable);
        thread1.start();
        thread2.start();
    }
}

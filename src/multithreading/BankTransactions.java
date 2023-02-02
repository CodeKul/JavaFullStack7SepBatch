package multithreading;

public class BankTransactions {
    int balance = 1000;
    synchronized void withdraw(int amount){
        System.out.println("in withdraw method");
        if (balance>=amount){
            balance = balance - amount;
            System.out.println("Remaining balance "+ balance);
        }else {
            System.out.println("Waiting for deposit");
            try {
            wait();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

            balance = balance - amount;
            System.out.println("Amount withdraw: "+balance);
            System.out.println("Transaction complete");
        }
    }
    synchronized void deposit(int amount){
        System.out.println("in deposit method");
        balance= balance+amount;
        System.out.println("Outstanding balance "+balance);
        notify();
    }
}

class BankTransactionImpl{
    public static void main(String[] args) {
        BankTransactions bankTransaction = new BankTransactions();
        BankThread1 thread1 = new BankThread1(bankTransaction);
        BankThread2 thread2 = new BankThread2(bankTransaction);
       // BankThread1 thread3 = new BankThread1(bankTransaction);
       // BankThread2 thread4 = new BankThread2(bankTransaction);

      //  thread4.start();
        thread1.start();
        thread2.start();
     //   thread3.start();
    }
}

class BankThread1 extends Thread{
    BankTransactions bankTransaction;
    BankThread1(BankTransactions bankTransaction){
        this.bankTransaction = bankTransaction;
    }
    @Override
    public void run() {
        bankTransaction.withdraw(2000);
    }
}
class BankThread2 extends Thread{
    BankTransactions bankTransaction;
    BankThread2(BankTransactions bankTransaction){
        this.bankTransaction = bankTransaction;
    }
    @Override
    public void run() {
        bankTransaction.deposit(3000);
    }
}

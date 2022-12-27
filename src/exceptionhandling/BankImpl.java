package exceptionhandling;

class SBI{
    double amount = 10000;

    void depositAmount(double depositAmount){
        amount += depositAmount;
        System.out.println("Balance "+amount);
    }
    void withdraw(double withdrawAmount) throws InsufficientBalanceException{
        if (amount < withdrawAmount) {
           throw new InsufficientBalanceException("Insufficient Balance");
        }else {
            amount -= withdrawAmount;
            System.out.println("Remaining balance " + amount);
        }
    }

}

public class BankImpl {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.depositAmount(5000);
        try {
            sbi.withdraw(20000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}

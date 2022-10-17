package polymorphism;

public class Bank {
    float getRateOfInterest(){
        return 7.5f;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.0f;
    }
}
class HDFC extends Bank{
    float getRateOfInterest() {
        return 8.0f;

    }
}
class BankImpl{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("sbi.getRateOfInterest()"+sbi.getRateOfInterest());
        HDFC hdfc = new HDFC();
        System.out.println("hdfc.getRateOfInterest()"+hdfc.getRateOfInterest());
    }
}
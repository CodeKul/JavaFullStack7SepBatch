package java8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());
    }
}

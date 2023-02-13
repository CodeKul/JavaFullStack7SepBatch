package collections;

import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericEx  ex = new GenericEx("Rs. 10");
        System.out.println(ex.getData());
        GenericEx ex1 = new GenericEx(10);
        System.out.println(ex1.getData());
    }
}

class GenericEx<T>{
    private T n;
    public GenericEx(T n){
        this.n = n;
    }
    public T getData(){
        return n;
    }
}
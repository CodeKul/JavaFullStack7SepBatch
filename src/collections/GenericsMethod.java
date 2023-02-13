package collections;

public class GenericsMethod {
    public <T> void createGeneric(T data){
        System.out.println(data);
    }
}
class GenericMethodImpl{
    public static void main(String[] args) {
        GenericsMethod m1 = new GenericsMethod();
        m1.createGeneric("25");
        m1.createGeneric(25);
    }
}
package java8;

import java.util.Iterator;
import java.util.zip.Checksum;

interface CheckNull{
    default void validateString(String msg){
        if (isNull(msg))
            System.out.println("Given string is empty");
        else
            System.out.println("Valid String");
    }

    default Boolean isNull(String msg){
        return msg == null || msg == "";
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {

        CheckNull checkNull = new CheckNull(){
          @Override
         public void validateString(String msg){
              CheckNull.super.validateString(msg);
          }

        };
        checkNull.validateString("");
    }
}

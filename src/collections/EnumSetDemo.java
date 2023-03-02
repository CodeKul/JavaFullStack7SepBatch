package collections;

import java.util.EnumSet;
import java.util.Iterator;

enum Days {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Days> holidays = EnumSet.of(Days.Sunday,Days.Saturday);
        Iterator<Days> iterator = holidays.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        EnumSet<Days> weekDays = EnumSet.noneOf(Days.class);
        System.out.println(weekDays);
    }
}

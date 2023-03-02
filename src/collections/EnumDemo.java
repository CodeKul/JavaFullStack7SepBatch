package collections;


public class EnumDemo {
    public static void main(String[] args) {
        enum days {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
        enum direction {East,West,South,North}
        for (days d:days.values()){
            System.out.println(d);
        }
    }
}

package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Java ");
        builder.append("is ");
        builder.append("Object ");
        builder.append("oriented ");
        builder.append("language ");
        builder.insert(0,"*");
        System.out.println(builder);
        builder.replace(0,1,"");
        System.out.println(builder);
        System.out.println(builder.reverse());

    }
}

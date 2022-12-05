package string;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        String s = "Codekul" + " Pvt." + "Ltd." + ","+"Pune";
        System.out.println(s);

        String s1 = ""+34+40+"%";
        System.out.println(s1);

        String s2 = "Pune";
        String s3 = "Maharashtra";
        System.out.println(s2.concat(",").concat(s3));

    }
}

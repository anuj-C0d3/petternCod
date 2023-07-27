import java.lang.String;

public class stringPractice {
    public static void main(String[] args) {
        String s1 = "pwjava";
        String s2 = "pwjava";
        String s3 = "pwJava";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        String s4 = new String("pwjava");
        String s5 = new String("pwjava");
        System.out.println(s4 == s5);
        System.out.println(s1 == s4);
        System.out.println(s4.equals(s5));
    }
}

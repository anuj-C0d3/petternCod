public class ConcatinationString {
    public static void main(String[] args) {
        String s5 = new String("pw");
        s5 = s5.concat("skill");
        System.out.println(s5);
        String s1 = "Pwjava";
        String s2 = s1.concat("skill");
        String s3 = new String("Pwjava");
        s3 = s3.concat("Skill");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String a = "PW";
        String b = "PW" + "java";
        String c = "PW" + "java" + "Blr";
        String d = a + b;
        String str = "PW" + 100 + 99;
        String rt = 100 + 99 + "PW";
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + str + "\n" + rt);
    }
}

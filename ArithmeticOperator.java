public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        // arithmetic operators (+,-,*,/,%)
        System.out.println("Addition - " + (a + b) + "\nsubtraction - " + (a - b) + "\nMultiplication - " + (a * b)
                + "\ndivision - " + (a / b) + "\nReminder - " + (a % b));
        // increament and decreament
        a++;
        b--;
        System.out.println("intcreamented a=" + a); // a=11
        System.out.println("decreamented b=" + b); // b=1
        // pre and post increament and decreament
        int c = a++ + ++b + a + --a + b--; // 11+2+12+11+2=38
        System.out.println("a=" + a);// a=11
        System.out.println("b=" + b);// b=1
        System.out.println("c=" + c);// c=38

    }
}
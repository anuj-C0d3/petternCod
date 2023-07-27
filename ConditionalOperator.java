public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 50;
        int b = 45;
        int c = 40;

        if (a < b) {
            System.out.println("a is less than b");
        } else if (a < c) {
            System.out.println("a is less than c");
        } else {
            System.out.println("a is greater than b and c");
        }
        // nesting if else using logical operator
        if ((a > b) && (b > c)) {
            System.out.println("a is greatest number");
            if (a == 50 || a < 50) {
                System.out.println("a is in half century");
            }
        }
    }
}

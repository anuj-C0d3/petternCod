public class TernaryOperator_SwitchCase {
    public static void main(String[] args) {
        // Ternary operator
        int a = 10;
        int b = 20;
        int c = 40;
        int res = (a < b) ? a : b;
        System.out.println(res);
        System.out.println((a < b) ? ((a < c) ? "a" : "b") : ((b < c) ? "b" : "c"));

        // Switch case
        int num = 200;
        switch (num) {
            case 200:
                System.out.println("Case1");
                break;
            case 300:
                System.out.println("Case2");
                break;
            case 400:
                System.out.println("Case3");
                break;
            default:
                System.out.println("Default");
        }
    }
}

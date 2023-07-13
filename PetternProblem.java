public class PetternProblem {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n + 1; j++) {
                if ((i == 0 || i == n || i == n / 2) && j > 0 && j < (n + 1) / 2
                        || j == 0 && i > 0 && i < n / 2
                        || j == (n + 1) / 2 && i > n / 2 && i < n || j == 0 && i == n - 1
                        || j == (n + 1) / 2 && i == 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i == 0 || i == n / 2 || i == n - 1 || j == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i == 0 || j == n / 4) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i == n - 1 && j > 0 && j < (n / 2) - 1
                        || j == 0 && i < n - 1 || j == (n / 2) - 1 && i < n - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
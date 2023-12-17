public class Test {
    static  void pattern(int n){
        n=(n+1)/2;
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

            int n = 5; // Number of rows (adjust as needed)

            // Print the top asterisk
            System.out.println("*");

            for (int i = 1; i <= n; i++) {
                System.out.print("*"); // Print the left asterisk

                // Print numbers in ascending order
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Print numbers in descending order
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }

                System.out.println("*"); // Print the right asterisk
            }

            // Print the bottom asterisk
            System.out.println("*");

    }
}

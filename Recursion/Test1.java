package Recursion;

public class Test1 {
    public static void print(int n) {

        // 5
        // 3
        // 1
        // 2
        // 4
        {
            if (n == 0) {
                return;
            }
            if (n % 2 != 0) {
                System.out.println(n);

            }
            print(n - 1);
            if (n % 2 == 0) {

                System.out.println(n);

            }

        }

    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}

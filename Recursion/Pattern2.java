package Recursion;

public class Pattern2 {
    public static void prnt(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        prnt(n - 1);

    }

    public static void prnt2(int n) {
        if (n == 0) {
            return;
        }
        prnt(n);
        System.out.println();
        prnt2(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        prnt2(n);

    }
}

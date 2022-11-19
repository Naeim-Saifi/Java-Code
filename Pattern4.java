package Recursion;

public class Pattern4 {
    static void print1(int n,int i) {
        if (i==0) {
            return;
        }
        System.out.print(n);
        print1(n+1,i-1);
    }

    static void space(int n) {
        if(n==0){
            return;
        }
        System.out.print(" ");
        space(n-1);
    }

    static void print2(int n,int i) {
        if(i==0){
            return;
        }
        System.out.print(i);
        print2(n, i-1);
    }

    static void cPrint(int n,int i,int sp){
        if(n==0){
            return;
        }
        print1(1, i);
        space(sp);
        print2(n, i);
        System.out.println();
        cPrint(n-1, i+1, sp-2);
    }

    public static void main(String[] args) {
        int n=4;
        int sp=(n*2)-2;
        cPrint(n, 1, sp);
    }
}
